import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)) {
                // If the character is a digit, push it onto the stack
                stack.push(ch - '0');
            } else {
                // If the character is an operator, perform the operation on the top two elements of the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        // The result will be the final element remaining in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "53+2*";

        int result = evaluatePostfix(postfix);

        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Result: " + result);
    }
}
