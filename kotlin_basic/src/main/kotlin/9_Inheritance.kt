// 기본은 final
open class Dog(open var age: Int = 0) {

    open fun bark() = println("멍멍")

}

class Bulldog(override var age: Int = 1) : Dog() {

    override fun bark() {
        println("컹컹")
        super.bark()
    }
}

// 하위 클래스에서 상속을 막으려면 final로 선언한다
// override 된 속성이나 함수는 하위 클래서에서 open으로 처리된다

// abstract class
abstract class Developer {

    val age: Int = 10
    abstract val company: String
    abstract fun code(language: String)
}

class BackendDeveloper(override val company: String) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val dog = Dog()
    println(dog.age)
    dog.bark()

    val bulldog = Bulldog()
    println(bulldog.age)
    bulldog.bark()

    val backendDeveloper = BackendDeveloper("mesh")
    backendDeveloper.code("java")

    printLanguage(backendDeveloper, "kotlin")
}

fun printLanguage(developer: Developer, language: String) {
    developer.code(language)
}