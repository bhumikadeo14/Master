package tutorials;

public class ReverseLetterOnly {
	
	public static String reverse(String input) {
		
		char[]inputchararr=input.toCharArray();
		
		int left=inputchararr[0];
		int right=inputchararr.length-1;
		
	    while(left<right) {
	    	
	    	if(!Character.isLetter(inputchararr[left])) {
	    		left++;
	    	}
	    	
	    	else if(!Character.isLetter(inputchararr[right])) {
	    		
	    		right++;
	    	}
	    	else {
	    		
	    		char temp=inputchararr[left];
	    		inputchararr[left++]=inputchararr[right];
	    		inputchararr[right--]=temp;
	    	}
		
	}
		return new String(inputchararr);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
