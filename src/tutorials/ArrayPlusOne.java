package tutorials;

public class ArrayPlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3}; 
		ArrayPlusOne obj = new ArrayPlusOne();
		obj.plusOne(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	 public int[] plusOne(int[] digits) {
	        
	    
	for (int i = digits.length - 1; i >= 0; i--) {
		if (digits[i] < 9) {
			digits[i]++;
			return digits;
		}
		digits[i] = 0;
	}

	digits = new int[digits.length + 1];
	digits[0] = 1;
	return digits;
	 }

}
