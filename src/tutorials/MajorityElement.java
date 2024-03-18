package tutorials;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {3, 2, 3}; // Majority element is 3
		
		MajorityElement obj = new MajorityElement();
        System.out.println("Majority Element: " + obj.majorityElement(nums));

	}
	
	public int majorityElement(int[] nums) {
        int max,count,maxcount=nums.length/2,maxelement=0;

        if(nums.length == 1)
            return nums[0];

        for(int i=0;i<nums.length-1;i++){
            count=0;
           for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
            
            
            
            if(count>=maxcount){
                maxcount = count;
                maxelement = nums[i];
            }  
        }
        return maxelement;
    }

}
