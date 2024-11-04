import java.util.Arrays;
import java.util.Objects;

public class Human3 {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[] schedule;
    private Family family;

    public Human3(){

    }
    public Human3(String surname, String name, int iq, int year, String[] schedule, Family family) {
        this.surname = surname;
        this.name = name;
        this.iq = iq;
        this.year = year;
        this.schedule = schedule;
        this.family = family;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {

        return surname;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    public String[] getSchedule() {

        return schedule;
    }

    public void setSchedule(String[] schedule) {

        this.schedule = schedule;
    }

    public int getIq() {

        return iq;
    }

    public void setIq(int iq) {

        this.iq = iq;
    }

    public Family getFamily() {

        return family;
    }

    public void setFamily(Family family) {

        this.family = family;
    }

    @Override
    public String toString() {
        return "Human3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human3 human3 = (Human3) o;
        return year == human3.year && iq == human3.iq && Objects.equals(name, human3.name)
        && Objects.equals(surname, human3.surname) && Objects.deepEquals(schedule, human3.schedule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, Arrays.hashCode(schedule));
    }
}
