package basic

fun main() {
    // 자바에서 if-else는 구문
    // 코틀린에서 if-else는 표현식

    val age = 10
    val result =
        if (age > 20) "성인"
        else "아이"

    // if-else 표현식이 있기 때문에 3항 연산자가 필요 없다
    val a = 1
    val b = 2
    val c = if (a > b) a else b
}