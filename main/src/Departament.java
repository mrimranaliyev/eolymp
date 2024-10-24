public class Departament {
    public String name;
    public Course course;
    public Professor professor;
    public Student[] students;

    public Departament(String name, Course course, Professor professor, Student[] students) {
        this.name = name;
        this.course = course;
        this.professor = professor;
        this.students = students;
    }

    public Departament() {

    }
}
