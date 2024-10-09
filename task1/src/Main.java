import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        for (int i = x;i>=0;i--){
            if (i%5==0) {
                System.out.println(i);
                break;
            }
        }



    }
}