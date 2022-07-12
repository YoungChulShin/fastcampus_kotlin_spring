package advanced

import java.time.LocalDateTime

//object Singleton {
//
//    val a = 1234
//
//    fun printA() = println(a)
//}
//
//fun main() {
//    println(Singleton.a)
//    Singleton.printA()
//}

//object DatetimeUtils {
//
//    val now: LocalDateTime
//        get() = LocalDateTime.now()
//
//    val now2: LocalDateTime = LocalDateTime.now()
//
//    const val DEFAULT_FORMAT = "YYYY-MM-DD"
//
//    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
//        return a == b
//    }
//}
//
//fun main() {
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//    println(DatetimeUtils.now)
//
//    println(DatetimeUtils.now2)
//    println(DatetimeUtils.now2)
//    println(DatetimeUtils.now2)
//
//    println(DatetimeUtils.DEFAULT_FORMAT)
//
//    val now = LocalDateTime.now()
//    println(DatetimeUtils.same(now, now))
//}

class MyClass {

//    val name: String
//    val age: Int
//    val school: String
//
//    constructor(name: String, age: Int) {
//        this.name = name
//        this.age = age
//        this.school = ""
//    }
//
//
//    constructor(name: String, age: Int, school: String) {
//        this.name = name
//        this.age = age
//        this.school = school
//    }

    private constructor()

    companion object {
        val a = 1234
        fun newInstance() = MyClass()
    }
}

fun main() {
    println(MyClass.newInstance())
    println(MyClass.newInstance())
}


