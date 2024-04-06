package tutorials;

public class MiddleofaLinkedList extends ListNode{

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        MiddleofaLinkedList middleofaLinkedList = new MiddleofaLinkedList();
        ListNode middle = middleofaLinkedList.middleElement(head);
        System.out.println("Middle element: " + middle.val);
    }

    public ListNode middleElement(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Move slow and fast pointers to find the middle of the list
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

/*class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}*/

