package ARRAYS;

public class Reverse_Array {
	
	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,6};
		int i=0,j=numbers.length-1;
		while (i<=j) {
			int temp=numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=temp;
			i++;
			j--;
			
		}
		
		for (int i1 = 0; i1 < numbers.length; i1++) {
			System.out.println(numbers[i1]);
			
		}
			
		}

}
