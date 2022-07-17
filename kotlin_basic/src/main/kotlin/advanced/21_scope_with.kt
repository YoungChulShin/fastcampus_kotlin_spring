package advanced

fun main() {

    val str = "안녕하세요"

    // 확장 함수는 아니고 별도의 함수
    // this 로 참조 가능하고 생략 가능하다
    with(str) {
        println("length=${length}")
    }

    val length = with(str) {
        length
    }
    println(length)
}