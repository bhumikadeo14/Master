package tutorials;

public class LinkedListHasCycle extends ListNode{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
		
		
		   public  boolean hasCycle(ListNode head) {
		    	//initialize fast and slow pointer to head (first node address)
			   
		    	ListNode slowptr=head;
				ListNode fastptr=head;
				while(slowptr!=null && fastptr!=null && fastptr.next!=null) {
					
					//increment both the pointers through the LL
					
					slowptr=slowptr.next;
					fastptr=fastptr.next.next;
					
					if(fastptr==slowptr) {
						return true;
					
				}
		    }
		        return false;
		    
}
	
}

