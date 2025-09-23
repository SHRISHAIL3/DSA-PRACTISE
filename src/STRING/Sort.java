package STRING;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String string="abcdefght";
		
		char arr[]=string.toCharArray();
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		}

}
