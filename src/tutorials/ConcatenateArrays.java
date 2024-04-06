package tutorials;

/* Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.*/

public class ConcatenateArrays {
	
	
	public int[] getConcatenation(int[] nums) {

        int [] ans = new int[2*nums.length];

        //iterate and add elements to the array first time

        for (int i=0;i<nums.length;i++){

            ans[i]=nums[i];
        }
        //set index to the last index of nums array 
        int index =nums.length;
// add original array element from the last index
        for (int i=0;i<nums.length;i++){

            ans[index++]=nums[i];
        }
        return ans;


        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
