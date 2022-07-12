package basic

fun main() {
    // if-else
    val job = "Software engineer"

    if (job == "Software engineer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    // if-else 표현식
    val age : Int = 30

    var str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    // if-else가 표현식이기 때문에 삼항연사자가 필요 없다
    val a = 1
    val b = 2
    val c = if (a > b) b else a
}