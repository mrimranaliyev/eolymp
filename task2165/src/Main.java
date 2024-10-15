import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.trim().replaceAll("\\s+"," ");
        System.out.println(s);

    }
}