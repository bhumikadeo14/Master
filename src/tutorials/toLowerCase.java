package tutorials;

/* Q70.Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.*/

public class toLowerCase {
	
	
	public String toLowerCase(String s) {
		
		char[] arr=s.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if('A'<=arr[i] && arr[i]<='Z') {
				
				arr[i]=(char)(arr[i]-'A'+'a');
			}
		}
		return new String(arr);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
