package coroutine

import kotlinx.coroutines.runBlocking

fun main() {

    // 일반적으로는 차단하지 않는다
    // runBlocking은 스레드를 차단한다
    runBlocking {
        println("Hello")
        println(Thread.currentThread().name)
    }

    println("World")
    println(Thread.currentThread().name)
}