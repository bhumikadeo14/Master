package tutorials;

public class RunningSumof1dArray {
    
    public int[] runningSum(int[] nums) {
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        
        return nums;
    }

    public static void main(String[] args) {
        // Example usage
        RunningSumof1dArray solution = new RunningSumof1dArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
