import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char [] c = s.toCharArray();
        c[0] = Character.toUpperCase(c[0]);
        for (int i = 1; i < c.length - 1; i++) {
            if (c[i] == ' ') {
                c[i + 1] = Character.toUpperCase(c[i + 1]);
            }
        }
        System.out.println(c);
    }
}