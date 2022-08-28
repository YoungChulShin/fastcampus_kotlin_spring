package async;

interface OrderNotifier {

    fun notify(menuName: String)
}

class BellNotifier : OrderNotifier {
    override fun notify(menuName: String) {
        println("벨 알람: ${menuName}이 준비되었습니다")
    }
}

class MonitorNotifier : OrderNotifier {
    override fun notify(menuName: String) {
        println("모니터 표시: ${menuName}이 준비되었습니다")
    }
}

class Store {

    private val notifiers = mutableListOf<OrderNotifier>()

    fun addNotifier(notifier: OrderNotifier) {
        this.notifiers.add(notifier)
    }

    fun ready(name: String) {
        notifiers.forEach { it.notify(name) }
    }
}

fun main() {
    val store = Store()
    store.addNotifier(BellNotifier())
    store.addNotifier(MonitorNotifier())

    store.ready("고객 1 - 아이스 아메리카노")
}