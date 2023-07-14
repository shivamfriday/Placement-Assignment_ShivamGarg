class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeSortedLists {
    public static ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1); // Dummy node as the head of the merged list
        ListNode curr = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        if (head1 != null) {
            curr.next = head1; // Connect the remaining nodes of the first list
        } else if (head2 != null) {
            curr.next = head2; // Connect the remaining nodes of the second list
        }

        return dummy.next;
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
        head1.next = new ListNode(10);
        head1.next.next = new ListNode(15);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(20);

        System.out.println("First Linked List:");
        printList(head1);

        System.out.println("Second Linked List:");
        printList(head2);

        ListNode mergedHead = mergeLists(head1, head2);

        System.out.println("Merged Linked List:");
        printList(mergedHead);
    }
}
