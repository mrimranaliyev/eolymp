public class Main {
    public static void main(String[] args) {
        String[] habits = {"eat", "drink", "sleep"};
        Pet dog = new Pet("dog", "Rock", 5, 75, habits);

        Human mother = new Human();
        Human father = new Human();
        Human child = new Human();


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