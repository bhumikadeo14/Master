package tutorials;

import java.util.HashSet;

/*Q.1684 You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.*/

public class CountofConsistentStrings {
	
	public int countConsistentStrings(String allowed, String[] words) {
		
		HashSet<Character> allwdstrcharset= new HashSet<>();
		
		for(char ch:allowed.toCharArray()) {
			
			allwdstrcharset.add(ch);
		}
		
		int count=0;
		
		for(String str: words) {
			
			int i=0;
			
			for(char ch: str.toCharArray()) {
				
				if(!allwdstrcharset.contains(ch)) break;
				
				i++;
					
				}
			if(i==str.length()) count++;
			}
		return count;
		}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
