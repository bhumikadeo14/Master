package tutorials;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aA";
		String updatedstr=reverseVowels(str);
		System.out.println("Updated String is- "+updatedstr);

	}
	
public static String reverseVowels(String s) {
	
	char[] chararr=s.toCharArray();
	char temp = 0;
	
	for(int i=0, j = s.length()-1; i<j;) {
		if (chararr[i] == 'a' || chararr[i] == 'e' || chararr[i] == 'i' || chararr[i] == 'o' || chararr[i] == 'u'||chararr[i] == 'A' || chararr[i] == 'E' || chararr[i] == 'I' || chararr[i] == 'O' || chararr[i] == 'U') {
            if (chararr[j] == 'a' || chararr[j] == 'e' || chararr[j] == 'i' || chararr[j] == 'o' || chararr[j] == 'u'||chararr[j] == 'A' || chararr[j] == 'E' || chararr[j] == 'I' || chararr[j] == 'O' || chararr[j] == 'U') {
            	temp = chararr[i];
            	chararr[i]=chararr[j];
            	chararr[j]=temp;
            	i++;
            	j--;
            }
            else {
            	j--;
            }
		}
		else {i++;
            }
	}
	
	//s= chararr.toString();
return String.valueOf(chararr);
}
}