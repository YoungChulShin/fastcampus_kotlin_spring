package advanced

// 함수형
// 동일한 값이 들어오면 항상 동일한 값을 리턴하는 순수 함수의 개념
// - 람다, 고차함수,
// 1급 객채: 함수를 반환하거나, 인자로 넘기거나 등을 할 수 있는 것


// 인자 없이 결과를 출력하는 함수
val printHello: () -> Unit = { println("hello") }

// 함수를 인자로 받을 수도 있다
fun call(block: () -> Unit) {
    block()
}

// 인자를 전달받아서 처리하는 함수
val printMessage: (String) -> Unit = { message: String -> println(message) }
val printMessage2: (String) -> Unit = { message -> println(message) }
val printMessage3: (String) -> Unit = { println(it) }

// 다수의 인자를 받아서 처리하는 함수
val plus: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }
val plus2 = { a: Int, b: Int, c: Int -> a + b + c }

// {} 표현식, () 함수를 넣을 수 있는 것 같다
// 고차함수: 함수를 인자로 넣을 수 있는 기능
fun forEachStr(collection: Collection<String>, action: (String) -> Unit) {
    for (item in collection) {
        // 전달 받은 값을, 전달 받은 함수 action으로 전달
        action(item)
    }
}

// 익명 함수
// - 함수를 리턴하는
fun outerFunc(): () -> Unit {
    return fun () {
        println("익명함수")
    }
}
fun outerFunc2(): () -> Unit = { println("익명함수") }

// 람다 표현식
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
val sum2 = { x: Int, y: Int -> x + y }

// 수행 람다 전달
// - 람다 식이 마지막에 있는 경우에는, 파라미터 밖에서 식을 구현할 수 있다

// 람다 레퍼런스
// - ::를 이용해서 참조 가능

fun main() {
    printHello
    printLine()
    val list = mutableListOf(printHello)
    // 함수 실행은 () 를 붙어야한다
    list[0]()
    // 함수도 데이터이기 때문에 변수화 할 수 있다
    val printMessageFunc = list[0]
    printMessageFunc()

    // 인자로 함수를 전달
    call(printHello)
    call(printMessageFunc)

    // 인자를 받아서 처리
    printMessage("안녕하세요")
    printLine()

    // 다수의 인자를 받아서 처리
    println(plus(1, 2, 3))

    printLine()

    // 고차함수 예시
    val list2 = listOf("a", "b", "c")
    val printStr: (String) -> Unit = { println(it) }
    forEachStr(list2, printStr)
    printLine()
    forEachStr(list2, { println(it) })
    printLine()
    forEachStr(list2) { println(it) }

    printLine()

    // 기존 forEach를 사용해서 구현
    list2.forEach { println(it) }
    // 기존 forEach를 사용하는데, 함수를 전달
    list2.forEach(printStr)

    printLine()

    // 람다 표현식 사용
    println(sum(1, 2))

    // 람다 레퍼런스
    val numberList = listOf("1", "2", "3")
    numberList.map { it.toInt() }.forEach { println(it) }
    // 탑 레벨 함수는 ::를 바로 사용, 나머지 클래스를 붙여준다
    numberList.map(String::toInt).forEach(::println)

}

fun printLine() {
    println("-----------------")
}