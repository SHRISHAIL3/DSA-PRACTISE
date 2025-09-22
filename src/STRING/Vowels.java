package STRING;

public class Vowels {
	
	public static void main(String[] args) {
		String string="hello world";
		string=string.toLowerCase();

		char arr[]=string.toCharArray();
		
		int vowel=0;
		int constant=0;
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') {
				vowel++;
				count++;
				
			}else {
				constant++;
				count++;
			}
			
		}
		System.out.println("The total no of letters "+count);
		System.out.println("the no of vowels are "+vowel);
		System.out.println("the no of constants are "+constant);
	}

}
