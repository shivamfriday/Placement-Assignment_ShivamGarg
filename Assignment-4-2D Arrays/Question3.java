import java.util.Arrays;

public class Question3 {
	public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] transpose = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] transposeMatrix = transpose(matrix);
        System.out.println("Transpose Matrix:");
        for (int[] row : transposeMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        // Output:
        // Transpose Matrix:
        // 1 4 7
        // 2 5 8
        // 3 6 9
    }
}
