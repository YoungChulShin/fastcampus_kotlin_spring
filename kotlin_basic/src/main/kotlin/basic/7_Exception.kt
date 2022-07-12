package basic
fun main() {

    // 명시적으로 checkedException 체크를 강조하지 않는다
    // Thread.sleep(1)

    // try-catch 사용은 가능
    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생")
    } finally {
        println("finally 실행")
    }

    val a = try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생")
    }

    println(a)

    val b: String? = null

    val c: String = b ?: fastFail("a is null")
    println(c)
}

fun fastFail(message: String): Nothing {
    throw IllegalArgumentException(message)
}