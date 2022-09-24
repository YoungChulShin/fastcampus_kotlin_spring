package basic
fun main() {

    // 0 ~ 3
    for (i in 0 .. 3) {
        println(i)
    }
    printSeparator()

    // 0 ~ 2
    for (i in 0 until 3) {
        println(i)
    }

    printSeparator()

    // 0, 2, 4, 6
    for (i in 0 .. 6 step 2) {
        println(i)
    }

    printSeparator()

    // 3, 2, 1
    for (i in 3 downTo 1) {
        println(i)
    }

}