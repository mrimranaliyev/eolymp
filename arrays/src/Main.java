public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArr(arr, arr.length - 1);

    }

    public static void printArr(int[] arr, int index) {
        if (index > 0) {
            printArr(arr, index - 1);
        }
        System.out.println(arr[index]);
    }
}