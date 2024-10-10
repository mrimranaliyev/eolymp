import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int power = 1;
        for (int i = 1; i <= x; i++) {
            power = power * i;

        }
        System.out.println(power);
     }





    }
