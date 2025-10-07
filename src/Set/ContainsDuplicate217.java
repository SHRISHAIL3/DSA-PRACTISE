package Set;

import java.util.HashSet;

public class ContainsDuplicate217 {
	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            if(h.contains(ele)){
                return true;

            }
            h.add(nums[i]);
        }
        return false;
        
    }
	
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6};
		System.out.println(containsDuplicate(nums));
		
	}

}
