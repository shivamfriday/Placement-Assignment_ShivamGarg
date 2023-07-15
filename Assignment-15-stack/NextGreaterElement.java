import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);  // Initialize all elements as -1

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 25, 10, 8, 6, 12, 18 };

        int[] nextGreater = nextGreaterElement(arr);

        System.out.println("Element\tNext Greater");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t\t" + nextGreater[i]);
        }
    }
}
