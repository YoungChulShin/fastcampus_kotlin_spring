package kotlinstudy.userservice.exception

data class ErrorResponse(
    val code: Int,
    val message: String,
)
