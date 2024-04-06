/* Q.136.Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space*/

package tutorials;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		
		for(int i=0;i<nums.length;i++) {
			
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i]!=nums[j])
					return nums[i];
			}
		}
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
