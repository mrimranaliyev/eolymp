public class Main {
    public static void main(String[] args) {
        Human3 mother = new Human3();
        Human3 father = new Human3();

        Family family = new Family(mother, father);

        Human3 child1 = new Human3();
        Human3 child2 = new Human3();

        family.addChild(child1);
        family.addChild(child2);

        System.out.println(family);
        System.out.println("Family members count: " + family.countFamily());

        family.deleteChild(2);
        System.out.println("After deleting a child:");
        System.out.println(family);
        System.out.println("Family members count: " + family.countFamily());
    }
}
