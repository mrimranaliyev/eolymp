public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet dog = new Pet("dog", "Rock", 5, 75, habits);

        Human mother = new Human();
        mother.name = "Jane";
        mother.surname = "Karleone";
        mother.age = 45;
        mother.iq = 100;
        Human father = new Human();
        father.name = "Vito";
        father.surname = "Karleone";
        father.age = 50;
        father.iq = 100;
        Human child = new Human();
        child.name = "Michael";
        child.surname = "Karleone";
        child.age = 22;
        child.iq = 101;
        child.pet = dog;


        System.out.println(mother);
        System.out.println(father);
        System.out.println(child);

        child.greetPet();
        child.describePet();
        dog.eat();
        dog.foul();
        dog.respond();


    }
}