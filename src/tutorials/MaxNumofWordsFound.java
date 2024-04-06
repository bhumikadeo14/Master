package tutorials;

/*Q.2214. A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.*/


public class MaxNumofWordsFound {
	
	
	public int mostWordsFound(String[] sentences) {
		
		int maxLen=0;
		
		for(String str:sentences) {
			
			int currLen=str.split(" ").length;
			
			if(maxLen<currLen)
				maxLen=currLen;
			
		}
		
		return maxLen;
		
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
