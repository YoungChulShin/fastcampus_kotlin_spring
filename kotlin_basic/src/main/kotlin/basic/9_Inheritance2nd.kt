package basic

// 모든 클래스의 부모는 Any
// equals, hashcode, toString을 가진다

// 기본은 final이고, 상속을 고려하면 open을 추가한다

// 변수, 메서드도 open 으로 선언해서 하위 클래스에서 재정의 가능하도록 할 수 있고, 하위클래스에서는 override를 이용해서 재정의 할 수 있다
// 한번 override가 되며, 추가적인 하위클래스에서 계속 재정의해서 사용할 수 있고, 이것을 막으려면 final을 해줘야한다

abstract class JavaDeveloper(val age: Int) {

    abstract val type: String

    fun hi() {
        println("안녕하세요. ${age}년차 ${type} 개발자입니다")
    }

    abstract fun sayFavoriteFunction()
}

class JavaBackendDeveloper(
    override val type: String = "백엔드",
    age: Int,
    ) : JavaDeveloper(age) {

    override fun sayFavoriteFunction() {
        println("stream")
    }
}

fun main() {
    val developer = JavaBackendDeveloper(age = 30)
    developer.sayFavoriteFunction()
    developer.hi()
}