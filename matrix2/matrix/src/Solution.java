public class Solution {
    public static int[][] transpose(int[][] matrix) {

        int a = matrix.length;
        int b = matrix[0].length;
        int[][] transposed = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
