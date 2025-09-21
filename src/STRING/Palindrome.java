package STRING;

public class Palindrome {
	public static void main(String[] args) {
		String s="oyO";
		
		char arr[]=s.toCharArray();
		int i=0; int j=arr.length-1;
		
		
		while (i<j) {
		
			
			if(arr[i]!=arr[j]) {
				System.out.println("not palidrome");
				return;
				
			}
			i++;
			j--;
			
			
		}
		System.out.println("Palidrome");
		
	}

}
