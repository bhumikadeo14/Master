package tutorials;

public class RemoveElementsfromList {
	public ListNode removeElements(ListNode head, int val) {
		
		//cases where head value is equal to the given value
		
		while(head!=null && head.val==val) {
			head=head.next;
		}
		ListNode currentNode=head;
		
		while(currentNode!=null && currentNode.next!=null) {
			if(currentNode.next.val==val) {
				currentNode.next=currentNode.next.next;	
			}
			else {
				currentNode=currentNode.next;
			}
			
		}
		return head;
	}

}
