package advanced

class MyGenerics<out T>(val t: T) {

}

class Bag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}

fun main() {

//    val generics = MyGenerics<String>("테스트")
//    // T 파라미터의 값을 통해서 추론 가능하다
//    val generics2 = MyGenerics("테스트")
//
//    val list1: MutableList<String> = mutableListOf()
//    val list2 = mutableListOf<String>()
//
//    val list3: List<*> = listOf<String>("테스트")
//    val list4: List<*> = listOf(1)

    // 공변성 - producer - out
    val generics = MyGenerics<String>("테스트")
    val charGenerics : MyGenerics<CharSequence> = generics

    // 반공변성 - consumer - in
    val bag = Bag<String>()
    bag.saveAll(
        mutableListOf<CharSequence>("1", "2"), mutableListOf("3", "4"),
    )
}