package ARRAYS.T2DA_ARRAYS;

import java.util.Scanner;

public class TwoMatrix {

public static void main(String[] args) {
	int matrix[][]= new int[3][3];
	Scanner scanner=new Scanner(System.in);
	for (int i = 0; i < matrix.length; i++) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[i][j]=scanner.nextInt();	
		}
	}
		for (int i1 = 0; i1 < matrix.length; i1++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i1][j]);
			}
			System.out.println();
				
			}
		scanner.close();	
	}
	
	
}

