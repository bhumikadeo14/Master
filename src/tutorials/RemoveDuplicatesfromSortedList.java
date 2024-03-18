package tutorials;

public class RemoveDuplicatesfromSortedList {
	
	public class Solution {
	    public ListNode deleteDuplicates(ListNode head) {
	        // Handle the case where the list is empty or has only one node
	        if (head == null || head.next == null) {
	            return head;
	        }
	        
	        // Initialize the current node to the head of the list
	        ListNode current = head;
	        
	        // Traverse the list
	        while (current != null && current.next != null) {
	            // Check if the current node's value is the same as the next node's value
	            if (current.val == current.next.val) {
	                // Skip the next node by updating the current node's next pointer
	                current.next = current.next.next;
	            } else {
	                // Move to the next node
	                current = current.next;
	            }
	        }
	        
	        // Return the head of the modified list
	        return head;
	    }
	}


}
