import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
    }
    private static boolean isSorted(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
    if (arr[1] > arr[i + 1]) {
     return false;
            }
        }
    return true;
    }
}