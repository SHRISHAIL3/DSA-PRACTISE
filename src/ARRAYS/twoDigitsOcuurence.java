package ARRAYS;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class twoDigitsOcuurence {
	
	public static boolean occrence(int arr[],int key) {
		int count=0;
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) {
				count++;
				
			}
			if(count>=2) {
				return true;
			}
			
		}
		return false;
		
		
	}
	
	public static boolean arraymethod(int arr[]) {
		
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]==arr[i-1]) {
				return true;
			}
			
		}
		
		
		
		
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY");
		int m=scanner.nextInt();		
		int  arr[]=new int [m];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
			
		}
		
//		System.out.println("ENTER THE ELEMENT TO KNOW HAS IT @ OCCURNCE OR NOT");
//		int key=scanner.nextInt();
//		System.out.println(occrence(arr, key));
		
	
		
		System.out.println(arraymethod(arr));
		
		
	}

}
