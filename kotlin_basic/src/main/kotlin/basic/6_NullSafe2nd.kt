package basic

fun main() {

    // nullable 타입은 ? 를 이용해서 접근 가능하다
    val a: String? = null
    val b = a?.length
    println(a?.length)
    println(b)

    // ?: 엘비스 연산자

}