package tutorials;

import java.util.LinkedList;

public class RemoveDuplicateLinkedList extends ListNode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
		
		
		RemoveDuplicateLinkedList obj = new RemoveDuplicateLinkedList();
		obj.deleteDuplicates(head);
		ListNode current = head;
		 while (current != null) {
	            System.out.print(current.val + " ");
	            current = current.next;
	        }
	        System.out.println();

	}
	 public ListNode deleteDuplicates(ListNode head) {
	
	ListNode current = head;

    while (current != null && current.next != null) {
        if (current.val == current.next.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

    return head;
}

}
