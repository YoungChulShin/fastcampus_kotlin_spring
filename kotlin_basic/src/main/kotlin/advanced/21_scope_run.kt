package advanced

class DatabaseClient {

    var url: String? = null
    var username: String? = null
    var password: String? = null

    fun connect(): Boolean {
        println("접속 중....")
        Thread.sleep(1000)
        println("접속 성공...")

        return true
    }
}

fun main() {

//    val config = DatabaseClient()
//    config.url = "localhost:3306"
//    config.username = "mysql"
//    config.password = "1234"
//    val connected = config.connect()

    // run
    // this 키워드로 대상을 접근할 수 있고, this는 생략 가능하다
    val connected = DatabaseClient().run {
        url = "localhost:3306"
        username = "mysql"
        password = "1234"
        connect()
    }

    // let으로도 사용 가능하나, it이 다 붙기 때문에 코드가 깔끔하지 않게 된다

    println(connected)
}