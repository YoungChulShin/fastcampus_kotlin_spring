package basic
fun main() {

    // 범위 연산자
    for (i in 0 .. 3) {
        println(i)
    }

    printSeparator()

    for (i in 0 until 3) {
        println(i)
    }

    printSeparator()

    for (i in 0 .. 6 step 2) {
        println(i)
    }

    printSeparator()

    for (i in 3 downTo  1) {
        println(i)
    }

    printSeparator()

    // 배열 반복
    val numbers = arrayOf(1, 2, 3)
    for (i in numbers) {
        println(i)
    }
}

fun printSeparator(){
    println("==========")
}