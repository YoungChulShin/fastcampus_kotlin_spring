package gettersetter;

import java.time.LocalDate;

public class JavaGetterSetterExample {

  public static void main(String[] args) {
    Student student = new Student();

    student.setName("헤일로");
    student.setBirthDate(LocalDate.of(200, 1, 1));

    System.out.println(student.getName());
    System.out.println(student.getBirthDate());
    System.out.println(student.getAge());
  }
}
