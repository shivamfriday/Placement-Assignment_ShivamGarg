import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.add(x); // Add the new element to q2

        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());

        stack.push(4);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Is Empty? " + stack.isEmpty());
    }
}
