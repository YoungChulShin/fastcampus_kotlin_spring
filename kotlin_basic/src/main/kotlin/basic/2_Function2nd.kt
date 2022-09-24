package basic

// 표현식 스타일
// Java에서 Static Function으로 표현된다
fun sum10(a: Int, b: Int) = a + b

// 디폴트 파라미터 지원
fun greeting10(message: String = "안녕하세요") {
    println(message)
}

fun main() {
    greeting10()
}