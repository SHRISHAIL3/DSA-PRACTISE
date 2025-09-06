package ARRAYS;

import java.util.Scanner;

public class Largest__number {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int array[]=new int[5];
		System.out.println("ENter 5 elements");
		
	   for (int i = 0; i < array.length; i++) {
		   array[i]=sc.nextInt();
		   }
	   
	   int larger=Integer.MIN_VALUE;
	   
	   for (int i = 0; i < array.length; i++) {
		   if (larger<array[i]) {
			   larger=array[i];
			
		}
	   }
	   System.out.println("the larger valve is " +larger);
	   sc.close();
		
	}

}
