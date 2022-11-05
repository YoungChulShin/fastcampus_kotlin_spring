package kotlinstudy.userservice.model

import kotlinstudy.userservice.domain.entity.User
import java.time.LocalDateTime

data class MeResponse(
    val id: Long,
    val profileUrl: String?,
    val username: String,
    val email: String,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?,
) {
    companion object {

        operator fun invoke(user: User) = with(user) {
            MeResponse(
                id = id!!,
                profileUrl = if (profileUrl.isNullOrEmpty()) null else "http://test/images/$profileUrl",
                username = username,
                email = email,
                createdAt = createdAt,
                updatedAt = updatedAt,
            )
        }
    }
}