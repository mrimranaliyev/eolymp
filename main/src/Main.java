import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {


        Departament departament1 = new Departament();
        departament1.name = "Pscology";
        departament1.course = new Course();

        departament1.course = new Course();

        departament1.professor = new Professor();

        departament1.professor = new Professor();


        Professor professor = new Professor();
        professor.fullName = " Shamil Abilov";
        professor.departament = departament1;
        departament1.professor = professor;

        Professor professor1 = new Professor();
        professor1.fullName = "Ali Jafarli";
        professor1.departament = departament1;
        departament1.professor = professor1;

        Course course = new Course();
        course.name = "Texnoera";
        course.departament = departament1;
        course.professor = professor;

        professor.course = course;

        Course course1 = new Course();
        course1.name = "Texnoera";
        course1.departament = departament1;
        course1.professor = professor;

        Student student = new Student();


    }
}