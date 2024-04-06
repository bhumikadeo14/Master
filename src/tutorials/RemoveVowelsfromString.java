package tutorials;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsfromString {

	public static String removeVowels( String input) {
	
		
		Set <Character> vowelset=new HashSet<>();
		
		vowelset.add('a');
		vowelset.add('e');
		vowelset.add('i');
		vowelset.add('o');
		vowelset.add('u');
		
		StringBuilder sb=new StringBuilder();
		
		for( char ch: input.toCharArray()) {
			
			if(!vowelset.contains(ch)) {
				
				sb.append(ch);
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String input="leetcodeisacommunityfordevelopers";
		
		String result=removeVowels(input);
		System.out.println(result);
		
	}
		 
		
}
