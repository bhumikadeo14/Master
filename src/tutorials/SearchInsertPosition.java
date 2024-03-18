package tutorials;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums={1,3,5,6,7};
        int target=9;
        SearchInsertPosition obj = new SearchInsertPosition();
        int k = obj.searchInsert(nums, target);
        System.out.println(k);

	}
	
	public int searchInsert(int[] nums, int target) {
        int k = 0;

        for (int i=0;i<nums.length;i++){
        	
        	//condition to check if the target element already exist in the array
           
            if(nums[i]==target) {
            	k=i;
            }
            else {
            	while(i<nums.length && target>nums[i]) {
            		i++;
            		k=i;
            	}
            }  
           
        }
        return k;
    }

}
