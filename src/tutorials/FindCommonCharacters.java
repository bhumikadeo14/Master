/*Q.1002. Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.*/

package tutorials;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    
	
	public List<String> commonChars(String[] words) {
		
		List<String> result=new ArrayList<>();
		
		for(int i=0;i<words.length;i++) {
			
			for(int j=0;j<words[i].length();j++) {
				
				if(words[i].charAt(j)==words[i].charAt(j+1) && words[i].charAt(j)!=' ') {
					result.add(words[i].charAt(j), null);
				}
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
