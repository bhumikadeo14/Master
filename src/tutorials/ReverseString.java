package tutorials;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		
		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			char temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			
		}
		
		for(int k=0;k<s.length;k++) {
			System.out.print(s[k]);
		}

	}

}
