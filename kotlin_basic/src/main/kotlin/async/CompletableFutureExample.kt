package async

import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executors

fun main() {
    val completableFuture = CompletableFuture.supplyAsync {
        Thread.sleep(2000)
        sum(100, 200)
    }

    completableFuture.thenApplyAsync(::println)

    println("계산 시작")
    while (!completableFuture.isDone) {
        Thread.sleep(500)
        println("결과 집계 중")
    }
    println("계산 종료")
}