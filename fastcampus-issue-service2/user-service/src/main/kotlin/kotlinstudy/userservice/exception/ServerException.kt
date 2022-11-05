package kotlinstudy.userservice.exception

sealed class ServerException(
    val code: Int,
    override val message: String,
): RuntimeException(message)

data class UserExistsException(
    override val message: String = "이미 존재하는 사용자입니다",
) : ServerException(409, message)

data class UserNotFoundExcpetion(
    override val message: String = "사용자 정보를 찾을 수 없습니다",
) : ServerException(404, message)

data class PasswordNotMatchedException(
    override val message: String = "패스워드가 잘못되었습니다",
) : ServerException(400, message)

data class InvalidJwtTokenException(
    override val message: String = "토큰이 잘못되었습니다",
) : ServerException(400, message)