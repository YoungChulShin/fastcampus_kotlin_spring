package kotlinstudy.userservice.service

import kotlinstudy.userservice.config.JWTProperties
import kotlinstudy.userservice.domain.entity.User
import kotlinstudy.userservice.domain.repository.UserRepository
import kotlinstudy.userservice.exception.InvalidJwtTokenException
import kotlinstudy.userservice.exception.PasswordNotMatchedException
import kotlinstudy.userservice.exception.UserExistsException
import kotlinstudy.userservice.exception.UserNotFoundExcpetion
import kotlinstudy.userservice.model.SignInRequest
import kotlinstudy.userservice.model.SignInResponse
import kotlinstudy.userservice.model.SignUpRequest
import kotlinstudy.userservice.utils.BCryptUtils
import kotlinstudy.userservice.utils.JWTClaim
import kotlinstudy.userservice.utils.JWTUtils
import org.springframework.stereotype.Service
import java.time.Duration

@Service
class UserService(
    private val userRepository: UserRepository,
    private val jwtProperties: JWTProperties,
    private val cacheManager: CoroutineCacheManager<User>,
) {
    companion object {
        private val CACHE_TTL = Duration.ofMinutes(1)
    }

    suspend fun signUp(signUpRequest: SignUpRequest) {
        with(signUpRequest) {
            userRepository.findByEmail(email)?.let {
                throw UserExistsException()
            }

            val user = User(
                email = email,
                password = BCryptUtils.hash(password),
                username = username,
            )
            userRepository.save(user)
        }

    }

    suspend fun signIn(request: SignInRequest): SignInResponse {
        return with (userRepository.findByEmail(request.email) ?: throw UserNotFoundExcpetion()) {
            val verified = BCryptUtils.verify(request.password, password)
            if (!verified) {
                throw PasswordNotMatchedException()
            }

            val jwtClaim = JWTClaim(
                userId = id!!,
                email = email,
                profileUrl = profileUrl,
                username = username,
            )
            val token = JWTUtils.createToken(jwtClaim, jwtProperties)

            cacheManager.awaitPut(key = token, value = this, ttl = CACHE_TTL)

            SignInResponse(
                email = email,
                username = username,
                token = token,
            )
        }
    }

    suspend fun logout(token: String) {
        cacheManager.awaitEvict(token)
    }

    suspend fun getByToken(token: String): User {
        val cachedUser = cacheManager.awaitGetOrPut(key = token, ttl = CACHE_TTL) {
            val decodedJWT = JWTUtils.decode(token, jwtProperties.secret, jwtProperties.issuer)
            val userId = decodedJWT.claims["userId"]?.asLong() ?: throw InvalidJwtTokenException()
            get(userId)
        }

        return cachedUser
    }

    private suspend fun get(userId: Long) : User {
        return userRepository.findById(userId) ?: throw UserNotFoundExcpetion()
    }
}