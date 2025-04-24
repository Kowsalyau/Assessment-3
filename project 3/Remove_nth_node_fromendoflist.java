class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Remove_nth_node_fromendoflist {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < n; i++) fast = fast.next;
        if (fast == null) return head.next;  // Remove the head if n is the size of the list
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;  // Remove the nth node from the end
        return head;
    }

    public static void main(String[] args) {
        Remove_nth_node_fromendoflist solution = new Remove_nth_node_fromendoflist();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = solution.removeNthFromEnd(head, 2);  // Remove 2nd node from the end
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
