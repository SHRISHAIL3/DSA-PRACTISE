package ARRAYS;

public class SunArray {
	
	public static void subarray(int numbers[]) {
	    int count = 0;
	    int max=Integer.MIN_VALUE;
   	 int min=Integer.MAX_VALUE;

	    for (int i = 0; i < numbers.length; i++) {
	    	 
	        for (int j = i; j < numbers.length; j++) {
	            int sum = 0;

	            System.out.print("Subarray: [ ");
	            for (int j2 = i; j2 <= j; j2++) {
	                System.out.printf("%-4d", numbers[j2]);
	                sum += numbers[j2];
	            }
	            System.out.printf("]  --> Sum: %-4d", sum);
	            count++;
	            System.out.println();
	           
	            if (max<sum) {
	            	max=sum;
					
				}
	            
	            if (min>sum) {
	            	min=sum;
					
				}
	            
	        }
	       
	      
	    }
	    System.out.println("the max array sum:"+max);
	    System.out.println("the min array sum:"+min);
	    System.out.println("\nTotal subarrays: " + count);
	}

	
	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,-6};
		subarray(numbers);

}
}
