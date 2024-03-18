package tutorials;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isAnagram(String s, String t) {
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String str = new String(arr);
        String str1 = new String(arr1);
        if(str.equals(str1)) {
            return true;
        }
        return false;
    }

}
