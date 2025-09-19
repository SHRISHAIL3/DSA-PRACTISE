package ARRAYS;

public class RotatedArrayTar {
	
	public static int  minimumindex(int nums[]) {
		int i=0;
		int j=nums.length-1;
		while (i<j) {
			int mid=(i+j)/2;
			
			if(nums[mid]>nums[j]) {
				i=mid+1;
			}else {
				j=mid;
			}	
		}
		return j;
		}
	
	public static int BinarySerach(int nums[],int left,int right,int target) {
		while (left<=right) {
			int mid=(left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}else if (nums[mid]< target) {
				left=mid+1;
				
			}else {
				right=mid-1;
			}
			
		}
		return -1;
	}
	
	public static int  decider(int nums[],int target) {
		int index=minimumindex(nums);
		
		if(nums[index]<=target&&target<=nums[nums.length-1]) {
			return BinarySerach(nums, index, nums.length-1, target);
		}else {
			return BinarySerach(nums, 0, index, target);
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		int nums[]= {4,4,5,6,7,1,2,3};
		
		System.out.println(decider(nums, 5));
	}

}
