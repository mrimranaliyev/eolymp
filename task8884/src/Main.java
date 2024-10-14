import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b || a == c || c == b) {
                System.out.println("bərabərtərəfli üçbucaq");
            } else if (a == b && b == c) {
                System.out.println("bərabəryanlı üçbucaq");
            } else {
                System.out.println("müxtəliftərəfli üçbucaq");
            }
        }
    }
}