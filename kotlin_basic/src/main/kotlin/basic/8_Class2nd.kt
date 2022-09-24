package basic

import java.time.LocalDateTime

// constructor 뒤에 기본 생성자를 넣을 수 있다. 생략도 가능하다
//class Cafe constructor(val name: String)
class Cafe (val name: String) {

    val brand: String
        get() = "스타벅스"

    val location: String
        get() {
            println("위치 계산 중. ${LocalDateTime.now()}")
            return "강동구 명일동"
        }

    var maxAmount: Int = 0
        set(value) {
            field = if (value > 10000) {
                10000
            } else {
                value
            }
        }
}

fun main() {

    val cafe = Cafe("백다방")
    cafe.maxAmount = 2000
    println("${cafe.brand} ${cafe.name}은 ${cafe.location}에 있습니다. 최대 결제 금액은 ${cafe.maxAmount}입니다")
}