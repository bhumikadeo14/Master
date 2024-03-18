package tutorials;

public class maximumNumberofBalloons {
	
	public static int maxNumberOfBalloons(String text) {
		
		int[] char_counts=new int[26];
		
		for (int i=0;i<text.length();i++) {
			
			char_counts[text.charAt(i)-'a']++;
		}
		
		int min= char_counts['b'-'a'];
		min=Math.min(min, char_counts['a'-'a']);
		min=Math.min(min, char_counts['l'-'a']/2);
		min=Math.min(min, char_counts['o'-'a']/2);
		min=Math.min(min, char_counts['n'-'a']);
		return min;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=maxNumberOfBalloons("loonbalxballpoon");
		System.out.println(count);

	}

}
