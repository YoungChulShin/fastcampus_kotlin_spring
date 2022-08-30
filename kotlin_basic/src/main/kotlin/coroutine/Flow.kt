package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

    val flow = simple()
    // 리액티브스트림의 subscribe 같은 개념
    flow.collect{ value -> println(value) }
}

fun simple() : Flow<Int> = flow {
    println("Flow started")

    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}