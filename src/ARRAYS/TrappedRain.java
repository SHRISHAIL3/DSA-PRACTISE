package ARRAYS;

public class TrappedRain {
	
	public static int  Trapped(int num[]) {
		int n=num.length;
		
		int leftmax[]=new int[n];
		leftmax[0]=num[0];
		for (int i = 1; i < num.length; i++) {
			 leftmax[i]=Math.max(leftmax[i-1],num[i] );
			 System.out.println(leftmax[i]);
			
		}
		
		System.out.println();
		
		int rightmax[]=new int[n];
		rightmax[n-1]=num[n-1];
		for (int i = n-2; i >=0; i--) {
			rightmax[i]=Math.max(rightmax[i+1], num[i]);
			System.out.println(rightmax[i]);
			
			
		}
		System.out.println();
		int trappedwater=0;
		for (int i = 0; i < num.length; i++) {
			int maxwaterlevel=Math.min(leftmax[i], rightmax[i]);
			
			System.out.println(maxwaterlevel);
			trappedwater+=maxwaterlevel-num[i];
			
		}
		
		
		return trappedwater;
		
		
	}
	
	public static void main(String[] args) {
		int height[]= {4,2,0,6,3,2,5};
	System.out.println(Trapped(height));
	}
	

}
