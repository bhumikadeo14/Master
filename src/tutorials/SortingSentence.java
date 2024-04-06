package tutorials;

import java.util.HashMap;
import java.util.Map;

public class SortingSentence {
	
	public String sortSentence(String s) {
        // Create a map to store index and words in the correct order
		
        Map<Integer, String> indexWordMap = new HashMap<>();

        // Separate words in the string based on space
        
        for (String word : s.split(" ")) {
            int lastIndex = word.length() - 1;
            
            // Get word and index separately
            
            int index = word.charAt(lastIndex) - '0';
            
            String actualWord = word.substring(0, lastIndex);

            indexWordMap.put(index, actualWord);
        }

        // Build the actual string
        StringBuilder actualString = new StringBuilder();
        for (int i = 1; i <= indexWordMap.size(); i++) {
            actualString.append(indexWordMap.get(i));
            actualString.append(" ");
        }

        return actualString.toString().trim();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
