package tutorials;

import java.util.HashSet;

public class StringisPangram {
	
	public static boolean ispangram(String str) {
		
		String lowercasestr=str.toLowerCase();
		
		HashSet<Character> alphabetset=new HashSet<>();
		
		for(int i='a';i<='z';i++) {
			
			alphabetset.add((char) i);
		}
		
		for(int i=0;i<lowercasestr.length();i++ ) {
			
			alphabetset.remove(lowercasestr.charAt(i));
			if(alphabetset.isEmpty())
				return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
