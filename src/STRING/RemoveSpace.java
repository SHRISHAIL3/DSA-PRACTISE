package STRING;

public class RemoveSpace {
	
	public static void main(String[] args) {
		String string="hello world i got it ";
		char arr[]=string.toCharArray();
		
		String res ="";
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != ' ') {
				
				res=res+arr[i];
			}
			
		}
		System.out.println(res);
 	}

}
