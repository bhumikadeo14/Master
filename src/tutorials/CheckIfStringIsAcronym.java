package tutorials;

import java.util.ArrayList;
import java.util.List;

/* Q2828. Given an array of strings words and a string s, determine if s is an acronym of words.

The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].

Return true if s is an acronym of words, and false otherwise */

public class CheckIfStringIsAcronym {
	
	public static boolean isAcronym(List<String> words, String s) {
		
		int n=0;
		
		//storing the length of the string we need to find
		
		n=s.length();
		int i=0;
		
		if (n!=s.length()) {
			return false;
		}
		
		for(String word: words) {
			
			if(word.charAt(0)!=s.charAt(i++)) return false;
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words= new ArrayList<>();
		words.add("alice");
		words.add("bob");
		words.add("charlie");
		String s="abc";
		
		boolean result=isAcronym(words, s);
		if (result)
		System.out.println("Congratulations the string is an acronym");
		
		else 
			System.out.println("Sorry the string is NOT an acronym");

	}

}
