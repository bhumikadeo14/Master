/*Q.290. Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter 
in pattern and a non-empty word in s. */

package tutorials;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
		
		if (pattern.length() != words.length) {
			return false; // Different number of characters and words, can't match pattern
		}
		
		Map<Character, String> patternMap = new HashMap<>();
		
		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);
			String word = words[i];
			
			if (patternMap.containsKey(ch)) {
				if (!patternMap.get(ch).equals(word)) {
					return false; // Conflict in mapping, pattern doesn't match
				}
			} else {
				if (patternMap.containsValue(word)) {
					return false; // Word already mapped to a different pattern character
				}
				patternMap.put(ch, word); // Create a new mapping
			}
		}
		
		return true; // All checks passed, pattern matches string
	}

	public static void main(String[] args) {
		WordPattern solution = new WordPattern();
		
		String pattern = "abba";
		String s = "dog cat cat dog";
		
		boolean result = solution.wordPattern(pattern, s);
		
		System.out.println(result); // Print the result
	}
}

