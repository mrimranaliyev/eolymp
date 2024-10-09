import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int per = 0;
    int cur = 1;
    int index = 2;
    while (true) {
        int newCur = cur + per;
        per = cur ;
        if (index == n){
            System.out.println(cur);
            break;
        }
        index++;
    }


    }
}