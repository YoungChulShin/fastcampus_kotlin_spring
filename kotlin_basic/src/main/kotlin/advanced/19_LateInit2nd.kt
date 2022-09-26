package advanced

class HiBot {

//    val greeting: String = getHello()
    val greeting: String by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        println("초기화를 합니다")
        getHello()
    }

    lateinit var name: String

    fun sayHello() = {
        this::name.isInitialized
        println(greeting)
    }
}


fun main() {

//    val hiBot = HiBot()
//    hiBot.sayHello()
//    hiBot.sayHello()
//    hiBot.sayHello()
//
//    println(hiBot.name)
}