class ListNode {
    char val;
    ListNode next;

    ListNode(char val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node list is a palindrome
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half of the linked list
        ListNode secondHalf = reverseList(slow);

        // Compare the first half with the reversed second half
        ListNode p1 = head;
        ListNode p2 = secondHalf;

        while (p2 != null) {
            if (p1.val != p2.val) {
                return false; // The characters don't match, not a palindrome
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true; // All characters match, it's a palindrome
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode('r');
        head.next = new ListNode('a');
        head.next.next = new ListNode('d');
        head.next.next.next = new ListNode('a');
        head.next.next.next.next = new ListNode('r');

        boolean isPalindrome = isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}
