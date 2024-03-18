package tutorials;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String inputstr="A man, a plan, a canal: Panama";
		String inputstr="Dad";
		
		String lowrcaseinputstr=inputstr.toLowerCase().replaceAll("[^a-z0-9]","");
		System.out.println(lowrcaseinputstr);
		
	}
}