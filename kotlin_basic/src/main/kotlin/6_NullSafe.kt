fun main() {

    // val a : String = null

    // ?를 이용해서 nullable 타입 선
    var a : String? = null
    println(a)
    println(a?.length)  // null이 출력

    // 3항 연사자
    val b = if (a != null) a.length else 0
    println(b)

    // 엘비스 연산
    val c = a?.length ?: 0
    println(c)

    // 샘플 코드
    val nullableStr = getNullStr()
    val nullableStrLength = nullableStr?.length ?: 11
    println(nullableStrLength)

    val length = getLengIfNotNull(null)
    println(length)

    // nullpointerexceptin 발생
    // 1. !! 단언 연산자 사용
    val d: String? = null
    val e = d!!.length
    // 2. null이 발생하는 java 코드를 사용할 때 -> 이 부분은 컴파일시점에 체크가 안된다

}

fun getNullStr() : String? = null
fun getLengIfNotNull(str: String?) = str?.length ?: 0