package tutorials;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		
		// create a dummy null reference with prev
		ListNode prev=null;
		
		while(head!=null) {
			ListNode node_next=head.next;
			//update current head pinter to point previous node address
			head.next=prev;
			//make current head prev
			prev=head;
			//make next node as the new head
			head=node_next;
		}
		return prev;
	}
	}

//please visit visit nick white video on youtube to understand above solution