import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int age;
    private int iq;
    private Family family;
    private String[][] schedule;

    public Human(String name, String surname, int age, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }
    public Family getFamily(){
        return family;
    }
    public void setFamily(){
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", family=" + family +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
