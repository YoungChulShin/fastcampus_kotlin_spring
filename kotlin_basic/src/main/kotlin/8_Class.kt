class Coffee(
    val name: String = "",
    val price: Int = 0,
    var iced: Boolean = false,
) {

    val brand: String
        get() = "스타벅스"

    var quantity: Int = 0
        set(value) {
            field = if (value > 0) value else 0
        }
}

class Employees

fun main() {
    val coffee = Coffee()
    val coffee2 = Coffee("아메리카오", 3000)

    coffee2.iced = true

    if (coffee2.iced) {
        println("아이스")
    }

    println("${coffee2.brand}의  ${coffee2.name} 가격은 ${coffee2.price} 수량은 ${coffee2.quantity}")
}
