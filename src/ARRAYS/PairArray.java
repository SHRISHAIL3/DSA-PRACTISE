package ARRAYS;

public class PairArray {
	public static void pa(int numbers[]) {
		int count=0;
		
		for (int i = 0; i < numbers.length; i++) {
			int curr=numbers[i];
			for (int j = i+1; j < numbers.length; j++) {
				System.out.println("("+curr+")("+numbers[j]+")" );
				count++;
				}
			
		}
		System.out.println("The total pairs are:"+count);
		
	}
	
public static void main(String[] args) {
	int numbers[]= {1,2,3,4,5};
	pa(numbers);
	
}

}
