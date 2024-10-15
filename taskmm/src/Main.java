import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int r = 0;
        int a = 1;
        for (int i = s.length() - 1; i >= 0;i--){
            r+=(s.charAt(i) - 48) * a;
            a = a * 10;

        }
        System.out.println(r + 1);
    }
}