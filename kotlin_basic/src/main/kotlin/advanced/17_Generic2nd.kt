package advanced

// *를 이용해서 여러타입을 선언 가

// 공변
// 반공변
// 불공변
// PECS
// - Producer extends
// - Consumer sumer
// 공변성: 자바 제네릭 extends, 코틀린 out
// 반공변: 자바 제네릭 super, 코틀린 in

// 상위 타입에 대해서 허용
class MyGeneric<out T>(val t: T)

class MyBag<T> {

    fun saveAll(
        to: MutableList<in T>,
        from: MutableList<T>
    ) {
        to.addAll(from)
    }
}

fun main() {
    // producer - 공변
    val generics = MyGeneric<String>("테스트")
    val charGenerics: MyGeneric<CharSequence> = generics

    // consumer - 반공변
    val bag = MyBag<String>()
    bag.saveAll(mutableListOf<CharSequence>("1", "2"), mutableListOf<String>("3", "4"))
}