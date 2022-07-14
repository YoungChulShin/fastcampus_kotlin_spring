package advanced

class HelloBot {

    // var greeting: String? = null
    // by lazy를 통해서 불변으로 만들면서, 지연초기화를 할 수 있다
    // 1회 실행된다
    val greeting: String by lazy {
        println("초기화")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello() = "안녕하세요"

fun main() {

    val helloBot = HelloBot()
    helloBot.sayHello()

    // helloBot.greeting = getHello()
    for (i in 1..5) {
        Thread {
            helloBot.sayHello()
        }.start()

    }
}
