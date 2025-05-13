public class MatrixAddition {
    public static int[][] add(int[][] A, int[][] B) {
        int[][] result = new int[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
        };
        int[][] B = {
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1},
            {5, 4, 3, 2, 1}
        };

        int[][] result = add(A, B);

        for (int[] row : result) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
