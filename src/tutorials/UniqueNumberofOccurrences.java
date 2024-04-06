
/*Q.1207.Given an array of integers arr, return true if 
 * the number of occurrences of each value in the array is 
 * unique or false otherwise*/
package tutorials;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
	
	public boolean uniqueOccurrences(int[] arr) {
		
		HashMap<Integer,Integer> num_occurrences=new HashMap<>();
		
		for(int num:arr) {
			num_occurrences.put(num, num_occurrences.getOrDefault(num, 0)+1);
		}
		
		HashSet<Integer>unique_values=new HashSet(num_occurrences.values());
		
		return num_occurrences.size()==unique_values.size();
		
	}

	public static void main(String[] args) {
	    UniqueNumberofOccurrences obj = new UniqueNumberofOccurrences();

	    // Test cases
	    int[] arr1 = { 1, 2, 2, 1, 1, 3 };
	    int[] arr2 = { 1, 2 };
	    int[] arr3 = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
	    
	    // Test uniqueOccurrences method
	    System.out.println("arr1 is unique: " + obj.uniqueOccurrences(arr1)); // Expected output: false
	    System.out.println("arr2 is unique: " + obj.uniqueOccurrences(arr2)); // Expected output: true
	    System.out.println("arr3 is unique: " + obj.uniqueOccurrences(arr3)); // Expected output: true
	}


}
