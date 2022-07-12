
// equals, hashcode, toString, copy
data class Person(val name: String, val age: Int)

fun main() {

    val person1 = Person(name = "tony", age = 12)
    val person2 = Person(name = "tony", age = 12)

    println(person1 == person2)
    println(person1)

    val set = hashSetOf(person1)
    println(set.contains(person1))
    println(set.contains(person2))

    // copy - 불변 객체를 새롭게 만들 수 있다
    val person3 = person1.copy(name = "ycshin")

    // component n
    // 변수에 대해서 component - n 의 변수가 생긴다
    println("이름: ${person3.component1()}, 나이: ${person3.component2()}")

    val (name, age) = person1
    println("이름: $name, 나이: $age")
}