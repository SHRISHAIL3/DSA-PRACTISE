package ARRAYS;

import java.util.Scanner;

public class Smallest_Number {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		int array[]=new int[5];
	System.out.println("ENter   5 elemets");
	for (int i = 0; i < array.length; i++) {
		array[i]=sc1.nextInt();
		
	}
	
	System.out.println("THE smallest elemnt is:");
	int small=Integer.MAX_VALUE;
	for (int i = 0; i < array.length; i++) {
		if (small>array[i]) {
			small=array[i];
			
		}
		
	}
	System.out.println(small);
	}

}
