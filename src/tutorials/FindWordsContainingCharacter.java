package tutorials;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
	
	public List<Integer> findWordsContaining(String[] words, char x) {
		
		List<Integer> result=new ArrayList<>();
		for(int i=0;i<words.length;i++)
		{
			for(int j=0;j<words[i].length();j++) {
				if(words[i].charAt(j)==x) {
					result.add(i);
					
				}
				
				
			}
	}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words={"Leet","Code"};
		char x='e';
		
		FindWordsContainingCharacter obj=new FindWordsContainingCharacter();
		List<Integer> result=new ArrayList<>();
		
		result=obj.findWordsContaining(words, x);
		System.out.println(result);
	}

}
