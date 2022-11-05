package kotlinstudy.userservice.utils

import kotlinstudy.userservice.config.JWTProperties
import mu.KotlinLogging
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class JWTUtilsTest {

    private val logger = KotlinLogging.logger {}

    @Test
    fun createTokenTest() {
        val jwtClaim = createClaim()
        val properties = createProperties()
        val token = JWTUtils.createToken(jwtClaim, properties)

        Assertions.assertThat(token).isNotNull

        logger.info { token }
    }

    @Test
    fun decodeTest() {
        val jwtClaim = createClaim()
        val properties = createProperties()
        val token = JWTUtils.createToken(jwtClaim, properties)

        val decode = JWTUtils.decode(
            token,
            secret = properties.secret,
            issuer = properties.issuer
        )

        with(decode) {
            logger.info { "claims : $claims" }

            val userId = claims["userId"]!!.asLong()
            Assertions.assertThat(userId).isEqualTo(jwtClaim.userId)

            val email = claims["email"]!!.asString()
            Assertions.assertThat(email).isEqualTo(jwtClaim.email)

            val profileUrl = claims["profileUrl"]!!.asString()
            Assertions.assertThat(profileUrl).isEqualTo(jwtClaim.profileUrl)

            val username = claims["username"]!!.asString()
            Assertions.assertThat(username).isEqualTo(jwtClaim.username)
        }
    }

    private fun createProperties() = JWTProperties(
            issuer = "java",
            subject = "auth",
            expiresTime = 3600,
            secret = "my-secret",
        )

    private fun createClaim() = JWTClaim(
            userId = 1,
            email = "test@gmail.com",
            profileUrl = "test.jpg",
            username = "개발자",
        )
}