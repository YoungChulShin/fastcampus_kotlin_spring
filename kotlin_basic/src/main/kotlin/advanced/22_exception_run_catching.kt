package advanced

fun getStr(): Nothing = throw Exception("예외 발생 기본 값으로 초기화")

fun main() {

//    val result = try {
//        getStr()
//    } catch (e: Exception) {
//        println(e.message)
//        "기본 값"
//    }

    // runCatching
    // - 함수형으로 try/catch를 수행
    // - 내부적으로 try/catch를 수행한다
    val result = runCatching { getStr() }
        .getOrElse {
            println(it.message)
            "기본 값"
        }

    println(result)

    val result2 = runCatching { getStr() }
        .getOrNull()

    println(result2)

    val result3 = runCatching { getStr() }
        .exceptionOrNull()

//    result3?.let {
//        println(it.message)
//        throw it
//    }

    val result4 = runCatching { "ddd" }
        .getOrThrow()
    println(result4)


    // map에서 예외가 발생하면 throw 된다
    val result5 = runCatching { "하이" }
        .map { "${it}, 안녕하세요" }
        .getOrThrow()
    println(result5)

    val result6 = runCatching { "안녕" }
        .mapCatching { throw Exception("에러") }
        .getOrDefault("기본값")

    println(result6)

    // getOrderDefault에 비해서 로직을 넣을 수 있다
    val result7 = runCatching { getStr() }
        .recover { "복구합니다" }
        .getOrNull()

    println(result7)

    val result8 = runCatching { getStr() }
        .recoverCatching { throw RuntimeException("test") }
        .getOrNull()

    println(result8)
}
