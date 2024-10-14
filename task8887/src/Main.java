import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ədədi daxil edin");
        int d = scanner.nextInt();
        if (d % 2 == 1){
            System.out.println(d + 2);
        } else {
            System.out.println(d + 1);
        }
    }
}