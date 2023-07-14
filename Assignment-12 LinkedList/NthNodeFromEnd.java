class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class NthNodeFromEnd {
    public static int findNthFromEnd(ListNode head, int N) {
        ListNode first = head;
        ListNode second = head;

        // Move the first pointer N steps ahead
        for (int i = 0; i < N; i++) {
            if (first == null) {
                // N is greater than the length of the linked list
                return -1; // Or handle the error condition
            }
            first = first.next;
        }

        // Move both pointers until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // At this point, the second pointer is pointing to the Nth node from the end
        return second.val;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int N = 2;
        int NthValue = findNthFromEnd(head, N);
        System.out.println("Value of the " + N + "th node from the end: " + NthValue);
    }
}
