package tutorials;

public class SquareRootCaluculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = 5;
	        int result = mySqrt(x);
	        System.out.println("The square root of " + x + " rounded down is: " + result);

	}
	
	 public static int mySqrt(int x) {
	        // Handle base cases
	        if (x == 0 || x == 1) {
	            return x;
	        }

	        // Binary search approach
	        int left = 1, right = x;
	        int result = 0;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            // Check if mid is the square root
	            if (mid * mid == x) {
	                return mid;
	            } else if (mid * mid < x) {
	                // If mid^2 is less than x, update result and search in the right half
	                left = mid + 1;
	                result = mid;
	            } else {
	                // If mid^2 is greater than x, search in the left half
	                right = mid - 1;
	            }
	        }

	        return result;
	    }

	    
}
