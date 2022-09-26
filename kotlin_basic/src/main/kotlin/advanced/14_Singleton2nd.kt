package advanced

import java.time.LocalDateTime

// object 키워드로 싱글톤 클래스 생성
object MySingleton {
    // private static final int
    val price = 1000

    // private static final MySingleton mySingleton
    // mySingleton.printPrice()
    fun printPrice() = println(price)
}

// public static final MyDatetimeUtils INSTANCE
// private MyDatetimeUtils() { }
object MyDatetimeUtils {

    // public final LocalDateTime() {
    //    return LocalDateTime.now();
    // }
    val now : LocalDateTime
        get() = LocalDateTime.now()

    // top level 또는 object에서만 사용 가능
    // public static final String DEFAULT_FORMAT = "YYYY-MM-DD"
    const val DEFAULT_FORMAT = "YYYY-MM-DD"

    //
    fun same(a: LocalDateTime, b: LocalDateTime) : Boolean {
        return a == b
    }
}

// companion object = 클래스에서 사용
// public final class MyStaticClass
class MyStaticClass {

    // private MyStaticClass() { }
    private constructor()

    companion object {
        // private static final int a = 1234;
        // without
        val a = 1234
        // private static final int b = 4567;
        var b = 4567
        private val c = 890
        private val myInstance = MyStaticClass()
        fun getInstance() = myInstance
    }

}

fun main() {
    val mySingleton = MySingleton.printPrice()

    val myStaticClass = MyStaticClass.getInstance()
    val myStaticClass2 = MyStaticClass.getInstance()
    if (myStaticClass == myStaticClass2) println("동일") else println("불일치")
    MyStaticClass.a
    MyStaticClass.b = 44



}
