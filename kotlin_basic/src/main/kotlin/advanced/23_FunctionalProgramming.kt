package advanced

fun main() {

    val list = mutableListOf(printHello)

    val func = list[0]
    // ()를 붙여야지 호출 가능하다
    func()

    call(printHello)

    val result = plus(1, 4)
    println(result)


    // 고차 함수
    val highOrderList = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it) }

    forEachStr(highOrderList, printStr)

    // 익명 함수
    outerFunc()
    outerFunc()()

    println(sum(1, 2))
    println(sum2(1, 2))

    // 람다 내 변수 참조
    arg1 {
        println(it)
    }

    // 후행 람다
    // 함수의 전달 인자가 마지막에 있으면 { }로 묶어서 함수를 직접 구현할 수 있다
    // forEachStr(highOrderList, printStr)
    forEachStr(highOrderList) {
        printStr(it)
    }

    // 람다 레퍼런스
    //val callReference : () -> Unit = { printHello() }
    //callReference()
    val callReference = ::printHello
    callReference()()

    val numberList = listOf("1", "2", "3")
    // numberList.map { it.toInt() }.forEach { println(it) }
    numberList.map(String::toInt).forEach(::println)

    // Arrow 라이브러리 사용
}

val printHello : () -> Unit = { println("Hello") }

val printMessage : (String) -> Unit = { message: String -> println(message) }
val printMessage2 : (String) -> Unit = { message -> println(message) }
val printMessage3 : (String) -> Unit = { println(it) }

val plus : (Int, Int) -> Int = {a, b -> a + b}

fun call(block: () -> Unit) {
    block()
}

//val func : () -> String = {""}

fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        action(item)
    }
}

fun outerFunc(): () -> Unit {
    return fun() {
        println("익명함수")
    }
}

fun outerFuncWithLambda(): () -> Unit = { println("익명함수") }

// 람다 표현식
val sum: (Int, Int) -> Int = {x: Int, y: Int -> x + y}
// 람다 표현식 생략 적용
val sum2 = {x: Int, y:Int -> x + y}


fun arg1(block: (String) -> Unit) {
    block
}
fun arg2(block: (String, String) -> Unit) { }