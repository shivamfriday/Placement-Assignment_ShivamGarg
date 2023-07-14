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

public class DeleteNodeAtPosition {
    public static ListNode deleteNode(ListNode head, int position) {
        if (head == null)
            return null;

        if (position == 1) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return head;
        }

        ListNode current = head;
        int count = 1;

        // Traverse to the node at the given position
        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current != null) {
            // Update the pointers of the previous and next nodes
            current.prev.next = current.next;
            if (current.next != null)
                current.next.prev = current.prev;
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
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);

        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        int position = 3;

        head = deleteNode(head, position);

        System.out.println("Modified Doubly Linked List (Node at position " + position + " deleted):");
        printList(head);
    }
}
