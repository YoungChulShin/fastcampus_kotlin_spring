package coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        println("Start")

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