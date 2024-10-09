import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int count = 0;
        while (n>10) {
            n /=10;
            count++;
        }
        long result = (long)Math.pow(10, count);
        System.out.println(result);





    }
}