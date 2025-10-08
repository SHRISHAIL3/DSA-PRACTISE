package ARRAYS;

public class MergeSortedArray {
	
	 public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	       
	        int i = m - 1; // Pointer for the last  element in nums1
	        int j = n - 1; // Pointer for the last element in nums2
	        int p = m + n - 1; // Pointer for the last position in nums1

	        
	        while (i >= 0 && j >= 0) {
	            if (nums1[i] > nums2[j]) {
	                nums1[p] = nums1[i];
	                i--;
	            } else {
	                nums1[p] = nums2[j];
	                j--;
	            }
	            p--;
	        }

	        // If there are remaining elements in nums2, copy them to nums1
	        while (j >= 0) {
	            nums1[p] = nums2[j];
	            j--;
	            p--;
	        }
	        return nums1;
	    }
	 
	 public static void main(String[] args) {
		 int[] nums1 = new int[6]; // Create array with space for 6 elements
		 nums1[0] = 1;
		 nums1[1] = 2;
		 nums1[2] = 3;
		 // rest remain 0 by default

		int nums2[]= {2,5,6};
		int res[]=merge(nums1, 3, nums2, 3);
		for (int i = 0;  i< res.length;i ++) {
			System.out.println(res[i]);
		}
		
	}

}
