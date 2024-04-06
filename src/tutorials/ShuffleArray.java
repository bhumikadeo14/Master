package tutorials;

public class ShuffleArray {
	
	public int[] shuffle(int[] nums, int n) {
	       //input nums = [2,5,1,3,4,7], n = 3
	        int[] arr = new int[2 * n];
	        for (int i = 0; i < n; i++) {
	            arr[2 * i] = nums[i];
	            arr[2 * i + 1] = nums[n + i];
	        }
	        return arr;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
