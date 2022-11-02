package study.kotlin.coroutine

import kotlinx.coroutines.runBlocking

fun main() {

    // 코루틴을 블록킹으로 생성
    // 외부라이브러리등 코루틴을 지원하지 않는 경우에 사용 (테스트, 스프링배치 등)
    runBlocking {
        println("Hello")
        println(Thread.currentThread().name)
    }

    println("World")
    println(Thread.currentThread().name)
}