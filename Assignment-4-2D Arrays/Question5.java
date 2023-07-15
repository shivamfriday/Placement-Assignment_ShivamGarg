import java.util.Arrays;

public class Question5 {

	public static int arrangeCoins(int n) {
        int row = 0;

        while (n >= row) {
            row++;
            n -= row;
        }

        return row - 1;
    }

    public static void main(String[] args) {
        int n = 5;

        int completeRows = arrangeCoins(n);
        System.out.println("Number of Complete Rows: " + completeRows);
        // Output: Number of Complete Rows: 2
    }
}
