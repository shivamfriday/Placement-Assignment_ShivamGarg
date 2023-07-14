class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class GreaterNodesLinkedList {
    public static ListNode createNewLinkedList(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1); // Dummy node as the head of the new linked list
        ListNode newHead = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val >= head2.val) {
                newHead.next = new ListNode(head1.val);
                head1 = head1.next;
            } else {
                newHead.next = new ListNode(head2.val);
                head2 = head2.next;
            }
            newHead = newHead.next;
        }

        return dummy.next; // Skip the dummy node and return the head of the new linked list
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
        ListNode head1 = new ListNode(5);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(8);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(7);
        head2.next.next = new ListNode(4);
        head2.next.next.next = new ListNode(5);

        System.out.println("First Linked List:");
        printList(head1);

        System.out.println("Second Linked List:");
        printList(head2);

        ListNode newHead = createNewLinkedList(head1, head2);

        System.out.println("New Linked List (Greater Nodes):");
        printList(newHead);
    }
}
