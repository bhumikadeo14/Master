package tutorials;

public class CountDuplicateCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="LittLeLadyLove";
		
		//Converting string into char array
		
		char[] inputchararray=input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
			
		  int count=1;
		    for(int j=i+1;j<input.length();j++) {
		    	
		    	if (inputchararray[i]==inputchararray[j]&& inputchararray[i]!=' ') {
		    		count++;
		    		
		    		//SET THE VALUE AT J INDEX TO "0" TO MARK THE VISITED CHARACTER AND AVOID RECOUNTING
		    		inputchararray[j]=0;
		    	}
		    }
		    if(count>1 && inputchararray[i]!=0) {
		    	System.out.println(inputchararray[i]+"-"+count);
		    }
			
		}

	}

}
