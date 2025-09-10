package ARRAYS;

public class Kadanes_maxSubArraysum {
	
	
	public static void maxsum(int numbers[] ) {
//		this logic fails if all numbers are negative
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i]>0) {
				cursum=cursum+numbers[i];
				
			}else if (cursum>0) {
				cursum=cursum+numbers[i];
				
			}	
			
			if (maxsum<cursum) {
				maxsum=cursum;
				
			}
			
		}
		System.out.println(cursum);
		System.out.println(maxsum);
		
	}
	
//	this logic fails if all numbers are negative
	public static  void kadena2(int numbers[]) {
		int currsum=0;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			currsum=currsum+numbers[i];
			if(currsum<0) {
				currsum=0;
				
			}
			
			max=Math.max(max, currsum);
			
			
		}
		System.out.println(max);
		
	}
	public static void main(String[] args) {
		int num[]= {-2,-3,4,-1,-2,1,5,-3};
//		maxsum(num);
		kadena2(num);
		
	}

}
