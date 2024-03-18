package tutorials;

import java.util.HashMap;
import java.util.Map;

public class ArrayContainsDuplicate2 {

	public static void main(String[] args) {
		int[] nums= {1,2,3,4,2};
		boolean res=containsNearbyDuplicate(nums, 4);
		
		if(res) {
			System.out.println("Input array contains duplicate elements");
		}
		else {
			System.out.println("No duplicate elements found");
		}
		

	}
	
public static boolean containsNearbyDuplicate(int[] nums, int k) {
	Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i])) {
            map.put(nums[i], i);
        }
        else {
            int diff = Math.abs(map.get(nums[i]) - i);
            if (diff <= k) {
                return true;
            }
            else {
                map.put(nums[i],i);
            }
        }
    }
    return false;
        
    }

}
