package study.kotlin.coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun sum(a: Int, b: Int) = a + b

fun main() = runBlocking<Unit> {

    val result1 = async {
        delay(2000)
        sum(1, 3)
    }

    val result2 = async {
        delay(3000)
        sum(2, 5)
    }

    println("result1 : ${result1.await()}")
    println("result2 : ${result2.await()}")
}