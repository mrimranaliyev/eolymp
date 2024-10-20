public class Main {
    public static void main(String[] args) {
        String resulte = menimUcunCapEt("Imran", 17, "Aliyev");
        System.out.println(resulte);
    }

    public static String menimUcunCapEt(String name, int age, String surname) {
        if (age < 18) {
            return "Chapa icaze yoxdur";
        }
            System.out.println("Salam,");
            System.out.println(name);
            System.out.println(surname);
            System.out.println(age);
            System.out.println("------");
            System.out.println("size nece komek ede bilerem?");
            return "Chap etdim";

    }
}
