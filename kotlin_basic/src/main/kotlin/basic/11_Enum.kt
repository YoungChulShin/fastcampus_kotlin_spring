package basic

enum class PaymentStatus(val label: String): Payable {
    UNPAID("미지급") {
        override fun isPayable() = true
    },
    PAID("지급완료") {
        override fun isPayable() = false
    },
    FAILED("지급실패") {
        override fun isPayable() = false
    },
    REFUNDED("환급") {
        override fun isPayable() = false
    };
}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    println(PaymentStatus.PAID)
    println(PaymentStatus.PAID.label)

    if (PaymentStatus.UNPAID.isPayable()) {
        println("지급 가능")
    }

    val failed = PaymentStatus.valueOf("FAILED")
    println(failed.name)
    println(failed)
    println(failed.label)

    for (status in PaymentStatus.values()) {
        println("[${status.name}] ${status.label} - ${status.ordinal}")
    }
}