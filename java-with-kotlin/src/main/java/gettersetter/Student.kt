package gettersetter

import java.time.LocalDate

class Student {

    var name: String? = null
    @JvmField
    // public LocalDate birthDate 로 생성
    var birthDate: LocalDate? = null
    val age: Int = 10
    var grade: String? = null
        private set

    fun changeGrade(grade: String) {
        this.grade = grade
    }
}