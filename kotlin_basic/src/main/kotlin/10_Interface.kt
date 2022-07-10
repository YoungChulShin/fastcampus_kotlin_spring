class Product(val name: String, val price: Int)

interface Wheel {
    fun roll()
}

interface Order {
    fun printId()
}

interface Cart: Wheel {

    var coin: Int
    val weight: String
        get() = "10KG"

    fun add(product: Product)
    fun rent() {
        if (coin > 0) {
            println("카트를 대여합니다")
        }
    }

    override fun roll() {
        println("카트가 굴러갑니다")
    }

    fun printId()
}

class MyCart(override var coin: Int) : Cart, Order {

    override fun add(product: Product) {
        if (coin <= 0) println("코인을 넣어주세요")
        else println("${product.name}이(가) 카트에 추가되었습니다")
    }

    override fun printId() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val cart = MyCart(coin = 100)
    cart.rent()
    cart.roll()
    cart.add(Product(name = "장난감", price = 1000))

    val cartService = CartService(cart)
    cartService.addCart(Product("과일", 100))
}

class CartService(val cart: Cart) {

    fun rent() {
        cart.rent()
    }

    fun addCart(product: Product) {
        cart.add(product)
    }

}