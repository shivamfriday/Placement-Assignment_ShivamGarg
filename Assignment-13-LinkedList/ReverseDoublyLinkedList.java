class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class ReverseDoublyLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode temp = null;

        // Swap the previous and next pointers of each node
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }

        // Update the head pointer to the last node (original tail node)
        if (temp != null) {
            head = temp.prev;
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
        head.next.prev = head;
        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        head = reverseList(head);

        System.out.println("Reversed Doubly Linked List:");
        printList(head);
    }
}
