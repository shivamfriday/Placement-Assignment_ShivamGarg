import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        int popped = stack.pop();

        if (popped == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(2);
        minStack.push(4);
        minStack.push(1);
        minStack.push(3);

        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());

        minStack.pop();

        System.out.println("Top: " + minStack.top());
        System.out.println("Min: " + minStack.getMin());
    }
}
