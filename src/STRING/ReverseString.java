package STRING;



public class ReverseString {
public static void main(String[] args) {
	
	 String aString="hello world";
	 char arr[]=aString.toCharArray();
	 
	 int left=0;
	 int right=arr.length-1;
	 
	 while (left<right) {
		 
		 char temp=arr[left];
		 arr[left]=arr[right];
		 arr[right]=temp;
		 
		left++;
		right--;
		
		
	}
	 String revString=new String(arr);
	 System.out.println(revString);
	 
}
}
