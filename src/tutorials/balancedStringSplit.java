package tutorials;

public class balancedStringSplit {
	
	public static int maxbalancedStringSplit(String input){
		
		//initialize count 
		
		int balancedcount=0;
        int count=0;
		
		for (int i=0;i<input.length();i++) {
			
		char current=input.charAt(i);
			
		if(current=='L') {
			count++;
		}
		else if(current=='R') {
			count--;
		}
		
		if(count==0) {
			balancedcount++;
		}
			
			
		}
		
		return balancedcount;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="RLRRLLRLRL";

		
		int totalCount= maxbalancedStringSplit(input);
		
		System.out.println(totalCount);

	}

}
