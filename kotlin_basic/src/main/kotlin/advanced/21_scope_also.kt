package advanced

class User(val name: String, val password: String) {

    fun validate() {
        if (name.isNotEmpty() && password.isNotEmpty()) {
            println("검증 성공")
        } else {
            println("검증 실패")
        }
    }

    fun printName() {
        println(name)
    }
}

fun main() {

//    val user = User(name = "ycshin", password = "1234")
//    user.validate()

    User(name = "ycshin", password = "1234").also {
        it.validate()
        it.printName()
    }

    User(name = "ycshin", password = "1234").run {
        validate()
        printName()
    }

    User(name = "ycshin", password = "1234").let {
        it.validate()
        it.printName()
    }


}