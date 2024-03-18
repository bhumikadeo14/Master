package tutorials;

import java.util.HashSet;

public class ArrayContainsDuplicate {

	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[] nums= {1,2,3,4,2};
			
			boolean res=checkduplicate(nums);
			
			if(res) {
				System.out.println("Input array contains duplicate elements");
			}
			else {
				System.out.println("No duplicate elements found");
			}
			}
	
	
			
			public static boolean checkduplicate(int[] nums) 
			
			{	HashSet<Integer> hm = new HashSet<>();
	        for(int i=0; i<nums.length; i++){
	            if(hm.contains(nums[i])){
	                return true;
	            }else{
	                hm.add(nums[i]);
	            }
	        }
	        return false;

		}
}

	



