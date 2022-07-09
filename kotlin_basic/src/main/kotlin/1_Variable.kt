// 클래스 없어 변수 선언 가능
// 탑레벨 변수
var x = 5

fun main() {
    x += 1
    println(x)

    val a : Int = 1

    val b = 1

    val c : Int
    c = 3

    val d : String = "Hello"
    // d = "hihi" <- compile error

    var e : String = "Hello"
    e = "hi"

    var f = 123
    // f = "hi"
}