package tutorials;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {4, 18, 5, 13, 11,4};

        System.out.println("Original Array: " + Arrays.toString(array));
        quicksort(array, 0, array.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    public static void quicksort(int[] array, int low, int high) {
    	
        //case when left pointer surpasses the right pointer;
    	if(low>=high) {
    		return;
    	}
    	//select last element of array as the pivot
    	int pivot=array[high];
    	
    	// initialize left pointer
    	int leftpointer=low;
    	
    	// initialize right pointer
    	
    	int rightpointer=high;
    	
    	
    	while(leftpointer<rightpointer) {
    		
    		while(array[leftpointer]<=pivot && leftpointer<rightpointer) {
    			leftpointer++;
    		}
    		while(array[rightpointer]>=pivot && leftpointer<rightpointer) {
    			rightpointer--;
    		}
    		swap(array,leftpointer,rightpointer);
    	}
    	//final swap when lp and rp are reach the  same index
    	swap(array,leftpointer,high);
    	
    	//recursively sort left subarray
    	quicksort(array, low, leftpointer-1);
    	
    	//recursively sort right subarray
    	quicksort(array, leftpointer+1,high );
    	
    }
    
 
    
    private static void swap(int[] array,int index1, int index2) {
    	int temp=array[index1];
    	array[index1]=array[index2];
    	array[index2]=temp;
    	
    }
}

    

    
