package tutorials;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,2,0,1};
		int d = missingNumber(arr);
	    System.out.println(d);

	}
	
	 public static int missingNumber(int[] nums) {
		 
		 
		 int n = nums.length;
		 int sum =0;
		 for(int i= 0 ; i<=n; i++) {
			 sum = sum + i;
		 }
		 
		 int arrsum = 0;
		 for(int i=0; i<nums.length; i++) {
			 arrsum = arrsum + nums[i];
		 }
		 
		 int diff = sum - arrsum;
	        
		 return diff;
	    }

}

