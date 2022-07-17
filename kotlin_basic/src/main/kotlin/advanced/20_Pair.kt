package advanced

data class Tuple(val a: Int, val b: Int)

fun plus(tuple: Tuple) = tuple.a + tuple.b
fun plus2(pair: Pair<Int, Int>) = pair.first + pair.second

fun main() {
    println(plus(Tuple(1, 2)))

    println(plus2(Pair(1, 2)))

    val pair = Pair("A", 1)
    println(pair)
    val newPair = pair.copy("B")
    println(newPair)

    // 구조분해 할당
    val (a, b) = newPair
    val (c: String, d: String, e: Int) = Triple("A", "B", 1)

    val map = mapOf("신영철" to "개발자")
    val map2 = mapOf(Pair("신영철", "개발자"), Pair("신영철2", "개발자2"))

    for ((key, value) in map2) {
        println("${key}의 직업은 ${value}입니다.")
    }


}