class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RetainMDeleteN {
    public static ListNode retainAndDelete(ListNode head, int M, int N) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            // Retain M nodes
            for (int i = 0; i < M && current != null; i++) {
                prev = current;
                current = current.next;
            }

            // Delete N nodes
            for (int i = 0; i < N && current != null; i++) {
                current = current.next;
            }

            // Connect the previous node to the current node
            prev.next = current;
        }

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);

        int M = 2;
        int N = 3;

        System.out.println("Original Linked List:");
        printList(head);

        head = retainAndDelete(head, M, N);

        System.out.println("Modified Linked List:");
        printList(head);
    }
}
