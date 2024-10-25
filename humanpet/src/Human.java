import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule; // Tapşırıqları saxlamaq üçün
    private Family family; // Ailə istinadı

    // Konstruktor
    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = new String[0][2]; // Boş cədvəl
    }

    // Getter və Setter metodları
    public String getName() {
        return name;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    // toString metodunu yenidən müəyyən et
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }

    // equals metodunu yenidən müəyyən et
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
        return year == human.year &&
                iq == human.iq &&
                name.equals(human.name) &&
                surname.equals(human.surname);
    }

    // hashCode metodunu yenidən müəyyən et
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + surname.hashCode() + year + iq;
    }
}
