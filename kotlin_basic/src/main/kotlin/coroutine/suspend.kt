package coroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() {
    doSomething()
    println("end")
}

fun printHello() = println("hello")

// suspend: 일시 중단이 가능한 함수
// coroutineScope: runBlocking과 달리 스레드 중단 없이 계속 사용 가능하다
suspend fun doSomething() = coroutineScope {

    launch {
        delay(1000)
        println("world!")
    }

    launch {
        printHello()
    }
}