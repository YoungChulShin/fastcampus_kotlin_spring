package study.kotlin.coroutine

import kotlinx.coroutines.*

suspend fun main() {
    println("시작")

    doSomething()

    println("종료")
}

fun printHello() = println("hello")

// 일시 중단이 가능한 함수
suspend fun doSomething() = coroutineScope {

    launch {
        delay(1000)
        println("안녕")
    }

    launch {
        delay(500)
        println("하세요")
    }

    printHello()
}