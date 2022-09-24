package basic

var outVariable = 5
val outValue = 6

fun main() {
    // 지연 할당 가능
    val lazyAssign: Int
    lazyAssign = 4
    println(lazyAssign)

    // 탑레벨 변수
    println(outVariable)
    println(++outVariable)
    println(outValue)
}

class Hello {

    fun sayHello() {
        println(outValue)
    }
}