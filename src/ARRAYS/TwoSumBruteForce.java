package ARRAYS;

import java.util.Scanner;



public class TwoSumBruteForce {
	
	public static int[] array(int sum[],int target) {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i+1; j < sum.length; j++) {
				if(sum[i]+sum[j]==target) {
					return new int[] {i,j};	
				}
			}
		}
		return new int[] {};
		
		
	}
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("ENTER THE ARRAY SIZE");
	int n=scanner.nextInt();
	int sum[]=new int[n];
	for (int i = 0; i < sum.length; i++) {
		sum[i]=scanner.nextInt();
		
	}
	System.out.println("ENter the target element");
	int target=scanner.nextInt();
	
	int sum1[]=array(sum, target);
//	System.out.println(sum1.length);
	for (int i = 0; i < sum1.length; i++) {
		System.out.println("THE INDEX ARE ");
		System.out.println(sum1[i]);
		
	}
	
}
}
