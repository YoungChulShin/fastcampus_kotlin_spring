package advanced

fun main() {

    // applys는 응답객체가 대상 객체이다
    val databaseClient = DatabaseClient().apply {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
    }

//    val connected = databaseClient.connect()
//    println(connected)

    databaseClient.connect().run { println(this) }


}