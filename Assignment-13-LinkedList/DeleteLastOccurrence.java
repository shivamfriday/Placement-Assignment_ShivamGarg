class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteLastOccurrence {
    public static ListNode deleteLastOccurrence(ListNode head, int key) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode lastOccurrence = null;

        while (curr != null) {
            if (curr.val == key) {
                lastOccurrence = prev;
            }
            prev = curr;
            curr = curr.next;
        }

        if (lastOccurrence == null) {
            return head; // Key not found, nothing to delete
        }

        if (lastOccurrence == head) {
            head = head.next; // Update head to the next node
        } else {
            lastOccurrence.next = lastOccurrence.next.next; // Delete the last occurrence
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
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(6);

        int key = 2;

        System.out.println("Original Linked List:");
        printList(head);

        head = deleteLastOccurrence(head, key);

        System.out.println("Modified Linked List (Last occurrence of " + key + " deleted):");
        printList(head);
    }
}
