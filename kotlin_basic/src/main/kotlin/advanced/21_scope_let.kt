package advanced

fun main() {

    val str: String? = null

    // let
    // - it으로 대상을 가리킬 수 있다
    // - 마지막 값이 리턴 값이 된다
    val result: Int? = str?.let {
        println(it)
        1234
    }

    val result2: Int? = str?.run {
        println(this)
        1234
    }

    println(result)
    println(result2)
}