package tutorials;

public class MergeTwoSortedLists {
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		
		//CREATE A DUMMY head NODE
		
		ListNode returnNode=new ListNode(0);
		ListNode currentNode=returnNode;
		
		//start traversing both the sorted list till one of it reaches its end point
		
		while(l1!=null && l2!=null) {
			if(l1.val<l2.val) {
				
			//updating address of the current node to the list node with small value
				currentNode=l1.next;
				l1=l1.next;
			}
			else {
				//updating address of the current node to the lust node with small value
				currentNode=l2.next;
				l2=l2.next;
			}
			currentNode=currentNode.next;
		}
		//appending remaining list elements
		if(l1!=null) {
			currentNode.next=l1;
			
			
		}
		//appending remaining list elements
		
		if(l2!=null) {
			currentNode.next=l2;
			
			
		}
		return returnNode.next;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
