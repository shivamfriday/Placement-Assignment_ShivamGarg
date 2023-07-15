import java.util.Stack;

public class StringReversal {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop characters from the stack to obtain the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";

        System.out.println("Original String: " + str);

        String reversed = reverseString(str);

        System.out.println("Reversed String: " + reversed);
    }
}
