package study.kotlin.coroutine

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

// 스레드 차단 없이 실행
//fun main() = runBlocking<Unit> {
//
//    launch {
//        delay(500)
//        println("World")
//    }
//
//    println("Hello")
//}

fun main() = runBlocking<Unit> {

    val job1 = launch {
        val elapsedTime = measureTimeMillis {
            delay(150)
        }
        println("async task-1 $elapsedTime")
    }

    val job2 = launch {
        val elapsedTime = measureTimeMillis {
            delay(100)
        }
        println("async task-2 $elapsedTime")
    }

    val job3 = launch(start = CoroutineStart.LAZY) {
        val elapsedTime = measureTimeMillis {
            delay(80)
        }
        println("async task-3 $elapsedTime")
    }

    println("job3 start")
    job3.start()
}