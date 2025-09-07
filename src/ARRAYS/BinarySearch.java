package ARRAYS;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i <n; i++) {
			arr[i]=scanner.nextInt();			
		}
		
		System.out.println("Enter the Element to find");
		int find=scanner.nextInt();
		
		int i=0,j=n-1;
			
			while(i<=j) {
				int mid=(i+j)/2;
				if(arr[mid]==find) {
					System.out.println("Element found at index:" +mid);
					break;
					
					
				}else if (arr[mid]<find) {
					i=mid+1;
					
				}else if (arr[mid]>find){
					j=mid-1;
				}else {
					System.out.println("element not found");
				}
				
				
				
			}
			
			
			
		}
	}


