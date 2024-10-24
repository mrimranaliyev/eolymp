public class Course {
    public String name;
    public Professor professor;
    public Student[] students;
    public Departament departament;

    public Course(String name, Professor professor, Student[] students, Departament departament) {
        this.name = name;
        this.professor = professor;
        this.students = students;
        this.departament = departament;
    }

    public Course() {

    }
}
