package advanced

// sealed -> 컴파일 시점에 하위 클래스를 알 수 있다
sealed class Developer {

    abstract val name: String
    abstract fun code(language: String)
}

data class BackendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 백엔드 개발자입니다. ${language}를 사용합니다")
    }
}

data class FrontendDeveloper(override val name: String) : Developer() {

    override fun code(language: String) {
        println("저는 프론트엔드 개발자입니다. ${language}를 사용합니다")
    }
}

object OtherDeveloper : Developer() {

    override val name = "익명"
    override fun code(language: String) {
        TODO("Not yet implemented")
    }
}

object DeveloperPool {
    private val pool = mutableMapOf<String, Developer>()

    fun add(developer: Developer) = when(developer) {
        is BackendDeveloper -> pool[developer.name] = developer
        is FrontendDeveloper -> pool[developer.name] = developer
        is OtherDeveloper -> println("지원하지 않는 개발자입니다")
//        else -> println("지원하지 않는 개발자입니다")
    }

    fun get(name: String) = pool[name]
}

fun main() {
    val backendDeveloper = BackendDeveloper(name = "흥민")
    DeveloperPool.add(backendDeveloper)

    val frontendDeveloper = FrontendDeveloper(name = "케인")
    DeveloperPool.add(frontendDeveloper)

    println(DeveloperPool.get("흥민"))
    println(DeveloperPool.get("케인"))
}