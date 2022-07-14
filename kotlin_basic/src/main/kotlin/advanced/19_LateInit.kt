package advanced

class LateInitTest {

    lateinit var text: String

    fun printText() = println(text)

    val textInitialized: Boolean
        get() = this::text.isInitialized
}

fun main() {
    val lateInitTest = LateInitTest()

    if (!lateInitTest.textInitialized) {
        lateInitTest.text = "초기화 시작"
    }

    lateInitTest.printText()

    if (!lateInitTest.textInitialized) {
        lateInitTest.text = "초기화 시작 한번 더"
    }

    lateInitTest.printText()

}