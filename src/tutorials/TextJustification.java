package tutorials;

public class TextJustification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] inputarray= {"This", "is", "an", "example", "of", "text", "justification."};

	    int maxwidth=16;
	    int charcount=0;
		
		for(int i=0;i<inputarray.length;i++) {
			
			if(charcount>16) {
				
				System.out.println();
				
			}
			
			else
				
				System.out.print(inputarray[i]+" "+" ");
			    charcount++;
			
			
		
		
	}

}
}