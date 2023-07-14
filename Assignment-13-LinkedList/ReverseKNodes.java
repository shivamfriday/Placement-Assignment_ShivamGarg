class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseKNodes {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head; // No need to reverse if k is 1 or the list is empty
        }

        ListNode dummy = new ListNode(-1); // Dummy node as the head of the result list
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;
        ListNode next = null;

        int count = 0;

        // Count the number of nodes in the linked list
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        // Reverse every k nodes
        while (count >= k) {
            ListNode subListPrev = prev;
            ListNode subListCurrent = current;
            ListNode subListNext = null;

            for (int i = 0; i < k; i++) {
                next = current.next;
                current.next = subListNext;
                subListNext = current;
                current = next;
            }

            prev.next = subListNext;
            subListPrev.next = prev;

            prev = subListPrev;
            current = prev.next;
            count -= k;
        }

        // Reverse the remaining nodes at the end of the list as a group
        if (count > 0) {
            ListNode subListPrev = prev;
            ListNode subListCurrent = current;
            ListNode subListNext = null;

            while (subListCurrent != null) {
                next = subListCurrent.next;
                subListCurrent.next = subListNext;
                subListNext = subListCurrent;
                subListCurrent = next;
            }

            prev.next = subListNext;
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
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        int k = 4;

        System.out.println("Original Linked List:");
        printList(head);

        head = reverseKGroup(head, k);

        System.out.println("Modified Linked List (Reversed every " + k + " nodes):");
        printList(head);
    }
}
