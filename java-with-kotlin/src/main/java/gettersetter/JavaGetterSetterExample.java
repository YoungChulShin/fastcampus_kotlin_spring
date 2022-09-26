package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

  public static void main(String[] args) {
    Student student = new Student();
    student.setName("코틀린");
    student.birthDate = LocalDate.of(2000, 1, 1);
    student.changeGrade("IH");

    System.out.println(student.getName());
    System.out.println(student.birthDate);
    System.out.println(student.getAge());
    System.out.println(student.getGrade());
  }
}
