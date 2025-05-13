public class MatrixMultiplication {
    public static int[][] multiply(int[][] A, int[][] B) {
        int n = A.length;
        int m = A[0].length;
        int p = B[0].length;
        int[][] result = new int[n][p];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < m; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {2, 0},
            {1, 2}
        };

        int[][] result = multiply(A, B);

        for (int[] row : result) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
