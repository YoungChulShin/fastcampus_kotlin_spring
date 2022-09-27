package gettersetter

fun main() {

    // java style
    val person = Person()
    person.setName("코틀린")
    person.setAge(10)
    person.setAddress("러시아")

    println(person.getName())
    println(person.getAge())

    // 코틀린 스타일
    // get, set을 다 사용할 수 있지만 코틀린 스타일로 하는 것을 선호
    val person2 = Person()
    person2.name = "코틀린"
    person2.age = 10

    println(person2.name)
    println(person2.age)

    // 별도의 변수가 없어도 getXXX 메서드는 프로퍼티처럼 참고 가능하다
    println(person2.uuid)

    // getX, setX가 있어야지 프로퍼티 이름으로 접속 할 수 있다

}