package STRING;

public class NoOfCharacter {
	public static void main(String[] args) {
		String string="hello world";
		string=string.toLowerCase();
		char arr[]=string.toCharArray();
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=' ') {
				count++;
			}	
		}
		
		System.out.println("The no of Charcter:"+count);
	}

}
