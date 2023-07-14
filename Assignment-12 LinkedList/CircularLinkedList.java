class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CircularLinkedList {
    public static boolean isCircular(ListNode head) {
        if (head == null) {
            return false; // An empty list cannot be circular
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a circular loop in the linked list
        head.next.next.next.next.next = head.next;

        boolean isCircular = isCircular(head);
        System.out.println("Is the linked list circular? " + isCircular);
    }
}
