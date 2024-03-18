package tutorials;

public class CountCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //String inputstring="Welcome";
     
     countchar("Life is good!");

}

public static int countchar(String inputstring) {
	
	
	int count=0;
	for(int i =0;i<inputstring.length();i++) {
   	 count++;
    }
    System.out.print("The number of characters in the input string are "+ count);
	return count;
	}

	

}
