import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menimUcunChapEt (menimUcunAdTelebEt());
    }
    public static boolean menimUcunChapEt(String name) {
            System.out.println("Salam," +name);
            System.out.println(" ");
            System.out.println("size nece komek ede bilerem?");

            return true;
    }
    public static String menimUcunAdTelebEt() {
        System.out.println("Adinizi daxil edin:");
        return new Scanner(System.in).nextLine();
    }
}
