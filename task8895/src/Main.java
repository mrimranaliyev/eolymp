import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ədədləri daxil edin");
        int z = scanner.nextInt();
        int x = scanner.nextInt();
        int k = scanner.nextInt();
        if ((z > 0 && (x < 0 || k < 0)) || (x > 0 && (z < 0 || k < 0)) || (k > 0 && (z < 0 || x < 0))){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}