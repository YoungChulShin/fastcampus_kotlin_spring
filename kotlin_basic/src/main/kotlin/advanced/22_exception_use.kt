package advanced

import java.io.FileWriter

fun main() {

    // use
    // - close를 자동으로 해준다
    FileWriter("test.txt")
        .use {
            it.write("Hello, Kotlin")
        }
}