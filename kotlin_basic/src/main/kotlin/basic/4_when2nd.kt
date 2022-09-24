package basic

fun main() {
    // java의 switch 문 같은 문법을 when 식으로 표현 가능
    // 포현식이기 때문에 결과를 변수로 받을 수도 있다
    // 컴파일 타임에 리스트 추론이 가능한 항목들은 컴파일러가 걸러준다
    val result = when (getColor()) {
        MyColor.BLUE -> 1
        MyColor.GREEN -> 2
        else -> 3
    }

    println(result)
}

enum class MyColor {
    BLUE, GREEN, RED
}

fun getColor() = MyColor.RED