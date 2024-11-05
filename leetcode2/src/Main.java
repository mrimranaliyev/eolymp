import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 16};
        int target = 31;
        System.out.println(Arrays.toString(indexQaytar(arr,target)));
    }

    public static int[] indexQaytar(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }

        }
        return null;
    }
}
