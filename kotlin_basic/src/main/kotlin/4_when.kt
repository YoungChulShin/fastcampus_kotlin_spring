fun main() {

    // 표현식
    val day = 2

    val result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result)

    // 조건을 ,로 여러개 선언 가능
    when(getNumber()) {
        0, 1 -> print("1 또는 2")
        else -> println("기타")
    }
}

fun getNumber() = 2