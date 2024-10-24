import javax.naming.Name;
import java.time.LocalDateTime;

public class Student {
    public String fullName;
    public String id;
    public Course course;
    public Professor professor;
    public Departament departament;

    public Student(String fullName, String id, Course course, Professor professors, Departament departament) {
        this.fullName = fullName;
        this.id = id;
        this.course = course;
        this.professor = professor;
        this.departament = departament;
    }

    public Student() {

    }
}
