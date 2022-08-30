package coroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun sum(a: Int, b: Int) = a + b

fun main() = runBlocking {

    // aysnc는 await와 함께해서 결과를 받아올 때 사용할 수 있다
    // async는 runBlocking 내부에서 동작한다
    val result1 = async {
        delay(3000)
        sum(1, 3)
    }

    val result2 = async {
        delay(5000)
        sum(2, 5)
    }

    println("result1 : ${result1.await()}")
    println("result2 : ${result2.await()}")
}