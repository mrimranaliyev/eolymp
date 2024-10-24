import java.time.LocalDateTime;

public class Professor {
    public String fullName;
    public Departament departament;
    public Course course;
    public Student[] students;

    public Professor(String fullName, Departament departament, Course course, Student[] students) {
        this.fullName = fullName;
        this.departament = departament;
        this.course = course;
        this.students = students;
    }

    public Professor() {

    }
}

