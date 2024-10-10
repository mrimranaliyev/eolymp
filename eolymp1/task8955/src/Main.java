import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n ; i++){
            arr[i]= scanner.nextInt();
        }
        int count = 0;
        for (int i = 0;i<n;i++) {
            if (arr[i] > 0) {
                count++;

            }
            if (count <= 0) {
                System.out.println("NO");
            } else {
                System.out.println(count);}}

                for (int i = 0; i < n; i++) {
                    if (arr[i] > 0) {
                        System.out.println(arr[i] + " ");
                    }


                }
            }
        }