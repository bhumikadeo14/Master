package tutorials;

public class CountCapitalizedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputstr="LiTtLeLAdYLoVe";
		int i,count=0;
		
		char[]inputstrchararray=inputstr.toCharArray();
		
		for ( i=0;i<inputstr.length();i++) {
			if (inputstrchararray[i]>='A'&& inputstrchararray[i]<='Z') {
				count++;
				
			}
			
		

}
		if(count>0) {
			
			System.out.println("List Capitalized words in the given string is- "+ count);
		
	}}
}



