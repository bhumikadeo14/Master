package tutorials;


/*Q66. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.*/


public class ArrayPlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,3,2,1}; 
		ArrayPlusOne obj = new ArrayPlusOne();
		obj.plusOne(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
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
