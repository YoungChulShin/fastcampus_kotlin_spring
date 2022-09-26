package advanced

// 확장함수: 기존 클래스에 기능을 추가하는 방법
fun String.getFirst() : Char {
    return this[0]
}

fun String.addFirstChar(char: Char) : String {
    return char + this.substring(0)
}

// 확장 함수보다 내부 함수가 더 우선시 된다

class MyGreeting(val message: String) {
    fun printGreeting() = println("hihihi")
}

fun MyGreeting?.printNullOrNotNull() {
    if (this == null) println("널입니다")
    else println("널이 아닙니다")
}

fun main() {
    println("AAAA".getFirst())
    println("BBBB".addFirstChar('A'))

    var myGreeting: MyGreeting? = null
    myGreeting.printNullOrNotNull()
}



//