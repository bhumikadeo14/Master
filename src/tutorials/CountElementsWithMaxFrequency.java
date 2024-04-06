/*You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those 
elements all have the maximum frequency.The frequency of an element is the number of occurrences of that element in the array.*/
package tutorials;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaxFrequency {
	
	int maxcount=1;
	 
	
	public int maxFrequencyElements(int[] nums) {
		
		int count = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, frequencyMap.get(num));
        }

        for (int freq : frequencyMap.values()) {
            if (freq == maxFreq)    count += freq;
        }

        return count;
		
	}

	public static void main(String[] args) {
		
		
		CountElementsWithMaxFrequency obj = new CountElementsWithMaxFrequency();

        // Example test case
        int[] nums = {1,2,2,3,1,4};
        int result = obj.maxFrequencyElements(nums);
        System.out.println("Total frequencies of elements with max frequency: " + result); // Expected output: 2
    }

	}


