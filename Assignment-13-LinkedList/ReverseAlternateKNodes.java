class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseAlternateKNodes {
    public static ListNode reverseAlternateKNodes(ListNode head, int k) {
        if (head == null || k == 1) {
            return head; // No need to reverse if k is 1 or the list is empty
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        int count = 0;

        // Reverse the first k nodes
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // Skip the next k nodes
        count = 0;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        // Recursively reverse the remaining alternate k nodes
        if (current != null) {
            current.next = reverseAlternateKNodes(current.next, k);
        }

        return prev;
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

        int k = 3;

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseAlternateKNodes(head, k);

        System.out.println("Modified Linked List (Reverse every alternate " + k + " nodes):");
        printList(head);
    }
}
