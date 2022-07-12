package basic

fun sum(a: Int, b: Int) : Int {
    return a + b
}

// 표현식
fun sum2(a: Int, b: Int) : Int = a + b

// 표현식 + 반환 타입 생략
fun sum3(a: Int, b: Int) = a + b

// 반환 타입이 없으면 Unit을 반환한다
fun printSum(a: Int, b: Int) : Unit {
    println("$a + $b = ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("$a + $b = ${a + b}")
}

fun printSum3(a: Int, b: Int) = println("$a + $b = ${a + b}")

// 디폴트 파라미터
fun greeting(message: String = "안녕하세요") {
    println(message)
}

//fun main() {
//    greeting()
//    greeting("hi")
//}

// named parameter
fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

fun main() {
    log(message = "인포로그")
    log(level = "DEBUG", message = "디버그 로그")
    log("WARN", "워닝 로그")
    log(level = "ERROR", "에러로그")
}