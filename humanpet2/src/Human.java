public class Human {
    public String name;
    public String surname;
    public int age;
    public int iq;
    public Pet pet;
    public Human mother;
    public Human father;
    public String[][] schedule;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public Human(String name, String surname, int year, Human mother, Human father) {
        this(name, surname, year);
        this.mother = mother;
        this.father = father;
    }


    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this(name, surname, year, mother, father);
        this.iq = iq;
        this.pet = pet;
        this.schedule = schedule;
    }

    public Human() {

    }

    public void greetPet() {
        System.out.println("Hello" + pet.nickname);
    }

    public void describePet() {
        String hiyleger=pet.trickLevel>50? "very sly" : "almost not sly";
        System.out.println("I have" + " " + pet.species + " " + "he is " + " " + pet.age + " " + "years old" + " " + "he is" + " " + hiyleger);
    }


    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + age +
                ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "none") +
                ", father=" + (father != null ? father.name + " " + father.surname : "none") +
                ", pet=" + pet + "}";
    }


}
