package tutorials;

import java.util.Arrays;

public class MaximumProductofTwoElementsInArray {
    
    public int maxProduct(int[] nums) {
    	Arrays.sort(nums);
        return ((nums[nums.length-1]-1)*(nums[nums.length-2]-1));
    } 
    

    public static void main(String[] args) {
        MaximumProductofTwoElementsInArray obj = new MaximumProductofTwoElementsInArray();
        int[] nums = {3, 4, 5, 2};
        System.out.println("Maximum product of two elements: " + obj.maxProduct(nums)); // Output should be 20
    }
}
