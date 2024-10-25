public class Human {
    private String name;
    private String surname;
    private int age;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello" + pet.getNickname());
    }

    public void describePet() {
        String hiyleger = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
        System.out.println("I have" + " " + pet.getSpecies() + " " + "he is " + " " +
                pet.getAge() + " " + "years old" + " "
                + "he is" + " " + hiyleger);
    }


    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + age +
                ", iq=" + iq + ", mother=" + (mother != null ? mother.name + " " + mother.surname : "none") +
                ", father=" + (father != null ? father.name + " " + father.surname : "none") +
                ", pet=" + pet + "}";
    }


}
