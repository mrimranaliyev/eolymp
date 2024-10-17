import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

     int[] arr = {5,6,4,7,8,2,1,3};
     for (int i = 0; i < arr.length - 1; i++) {
         int min = arr[i];
         int minIndex = i;
         for (int j = i + 1; j < arr.length; j++) {
             if (min > arr[j]){
                 min = arr[j];
                 minIndex = j;
             }
         }
         int temp = arr[i];
         arr[i] = min;
         arr[minIndex] = temp;
     }
        System.out.println(Arrays.toString(arr));
    }
}