package advanced

// 가변 프로퍼티에 대해서 지연초기화를 할 수 있는 기능
// 예: autowired, 테스트에서 setup에서 초기화가 되어야할 경우
// isInitialized

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