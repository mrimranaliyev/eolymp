import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 2, 3, 9, 4, 1};
        System.out.println(Arrays.toString(arr));

        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                System.out.println(Arrays.toString(arr));
            }
            if (isSorted) {
                break;
            }
            isSorted = true;
            System.out.println("------------------");
        }
    }
}