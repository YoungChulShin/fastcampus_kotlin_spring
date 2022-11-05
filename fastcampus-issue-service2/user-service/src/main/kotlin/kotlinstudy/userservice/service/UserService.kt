package kotlinstudy.userservice.service

import kotlinstudy.userservice.domain.entity.User
import kotlinstudy.userservice.domain.repository.UserRepository
import kotlinstudy.userservice.exception.UserExistsException
import kotlinstudy.userservice.model.SignUpRequest
import kotlinstudy.userservice.utils.BCryptUtils
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {

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
}