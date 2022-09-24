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

    // try도 표현식이기 때문에 값을 받을 수 있다
    val a = try {
        "1111".toInt()
    } catch (e: Exception) {
        println("에러 발생")
    }

    println(a)

    // 항상 FastFail하는 코드는 Nothing 타입을 반환한다
    // elvis 연산자와 함께 사용하면

    val nullable: String? = null
    val nonnull: String = nullable ?: fastFail("is null")
    println(nonnull)
}

fun fastFail(message: String): Nothing {
    throw IllegalArgumentException(message)
}