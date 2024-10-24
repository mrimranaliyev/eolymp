public class Human {
    public String name;
    public String surname;
    public int year;
    public int IQ;
    public Pet pet;
    public Human mother;
    public Human father ;
    public String [][] schedule;

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }
    public Human() {

    }
    public void greetPet () {

    }
    public void describePet() {

    }

}
