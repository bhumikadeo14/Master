package tutorials;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello World of Bebuuu";
		LengthofLastWord obj = new LengthofLastWord();
		int k = obj.lengthOfLastWord(str);
		System.out.println(k);

	}
	
public int lengthOfLastWord(String s) {
	String[] s2 = s.split(" ");
	int k = s2[s2.length-1].length();
	return k;
        
    }

}
