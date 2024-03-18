package tutorials;

public class MergeSortedArray {

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index for nums1
        int j = n - 1; // Index for nums2
        int k = m + n - 1; // Index for the merged array

        while (i >= 0 && j >= 0) {
            // Compare elements from the end of both arrays and merge them into nums1
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        // If there are remaining elements in nums2, copy them to nums1
       while (j >= 0) {
           nums1[k--] = nums2[j--];
        }
    }

    // Utility method to print an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example Usage:
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6,7};
        int n = 4;

        System.out.println("Original Arrays:");
        printArray(nums1);
        printArray(nums2);

        // Merge arrays
        merge(nums1, m, nums2, n);

        System.out.println("Merged and Sorted Array:");
        printArray(nums1);

}
}
