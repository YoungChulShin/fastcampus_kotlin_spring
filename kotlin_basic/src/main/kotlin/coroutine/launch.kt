package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        println("Start")

        // job을 통해서 처리할 수 있지만, 처리의 결과를 가져올 수는 없다
        val job1 = launch {
            val elapsedTime = measureTimeMillis {
                delay(250)
            }
            println("task1 - $elapsedTime ms")
        }

        val job2 = launch {
            val elapsedTime = measureTimeMillis {
                delay(200)
            }
            println("task2 - $elapsedTime ms")
        }

        println("job2 completed: ${job2.isCompleted}")

        println("End")
    }
}