class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

class Removelinkedlistelements {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;  // Remove the node
            } else {
                current = current.next;  // Move to the next node
            }
        }

        return dummy.next;  // Return the updated head
    }

    public static void main(String[] args) {
        Removelinkedlistelements solution = new Removelinkedlistelements();

        // Example: Create linked list 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        // Remove all nodes with value 6
        head = solution.removeElements(head, 6);

        // Print the list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
