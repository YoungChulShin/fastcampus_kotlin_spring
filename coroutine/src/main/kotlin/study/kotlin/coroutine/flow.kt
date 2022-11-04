package study.kotlin.coroutine

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val flow = simple()
    flow.collect { value -> println(value) }
}

fun simple(): Flow<Int> = flow {
    println("flow started")

    for (i in 1..3) {
        kotlinx.coroutines.delay(100)
        emit(2)
    }
}