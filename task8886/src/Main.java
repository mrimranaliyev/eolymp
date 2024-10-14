import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ədədi daxil edin");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println(n-2);
        }else {
            System.out.println(n-1);

        }
    }
}