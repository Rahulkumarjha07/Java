class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    ListNode head;

    // insert at end
    public void insert(int val) {
        ListNode newnode = new ListNode(val);

        if (head == null) {
            head = newnode;
            return;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    // display linked list
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // palindrome check
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null)
            return true;

        // Step 1: find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        ListNode curr = slow.next;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: compare halves
        ListNode left = head;
        ListNode right = prev;

        while (right != null) {
            if (left.val != right.val)
                return false;

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);

        list.display();
        System.out.println(list.isPalindrome(list.head));
    }
}
