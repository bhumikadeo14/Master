package tutorials;

import java.util.List;

public class CountPairSumLessThanTarget {
    
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                int sum = nums.get(i) + nums.get(j);
                if(sum < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        CountPairSumLessThanTarget solution = new CountPairSumLessThanTarget();
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        int target = 7;
        int result = solution.countPairs(nums, target);
        System.out.println("Number of pairs with sum less than target: " + result);
    }
}
