package tutorials;

public class IntersectionofTwoLinkedLists extends ListNode{

	public static void main(String[] args) {
		
	}
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			
			
			int lenA=getListLength(headA);
			int lenB=getListLength(headB);
			
			while(lenA>lenB) {
				lenA--;
				headA=headA.next;
			}
			while(lenB>lenA) {
				lenB--;
				headB=headB.next;
			}
			
			while(headA!=headB) {
				
				headA = headA.next;
			      headB = headB.next;
				
			}
	        
			return headA;

	}

		private int getListLength(ListNode head) {
		    
			int len = 0;

		    while (head != null) {
		    	
		      len++;
		      //incremeting the pointer to next address while it doesnt encounter null
		      
		      head = head.next;
		    }

		    return len;
		  }	
		
		
}

