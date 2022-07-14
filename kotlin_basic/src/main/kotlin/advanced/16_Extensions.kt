package advanced

fun String.first() : Char {
    // this -> receiver. 수신자 객체
    return this[0]
}

fun String.addFirst(char: Char): String {
    return char + this.substring(0)
}

class MyExample {

    fun printMessage() = println("내부 함수 출력")
}

fun MyExample.printMessage() = println("외부 함수 출력")
fun MyExample.printMessage(message: String) = println(message)

fun MyExample?.printNullOrNotNull() {
    if (this == null) println("null 입니다")
    else println("null이 아닙니다")
}

fun main() {
    println("ABCD".first())
    println("ABCD".addFirst('Z'))

    // 확장 함수와 내부 함수가 이름, 구조가 같을 경우에 내부 함수를 출력
    MyExample().printMessage()
    MyExample().printMessage("test")

    val myExample: MyExample? = null
    myExample.printNullOrNotNull()

    MyExample().printNullOrNotNull()
}