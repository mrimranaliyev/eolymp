import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("a-nı daxil edin");
        double a = new Scanner(System.in).nextDouble();

        System.out.println("b-ni daxil edin");
        double b = new Scanner(System.in).nextDouble();

        System.out.println("əməliyyatı daxil edin: +,-,*,/");
        char operation = new Scanner(System.in).nextLine().charAt(0);

        double result = 0;
        if (operation == '+') {
            result = a + b;
        } else if (operation == '-') {
            result = a - b;
        } else if (operation == '/') {
            result = a / b;
        } else if (operation == '*') {
            result = a * b;
        } else {
            System.out.println("əməliyyat yanlışdır!");
        }
        System.out.println("nəticə=" + result);
    }
}