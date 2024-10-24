public class main {
    public static int[][] main(int[][] matrix) {
        int m = matrix.length;       // Satır sayısı
        int n = matrix[0].length;    // Sütun sayısı

        // Yeni transpoze matrisini oluştur
        int[][] transposed = new int[n][m];

        // Transpoze matrisini doldur
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result1 = main(matrix1);
        printMatrix(result1); // Çıktı: [[1, 4, 7], [2, 5, 8], [3, 6, 9]]

        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] result2 = main(matrix2);
        printMatrix(result2); // Çıktı: [[1, 4], [2, 5], [3, 6]]
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j]);
                if (j < row.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
