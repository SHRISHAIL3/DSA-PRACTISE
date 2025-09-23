package STRING;

public class WordCount {
public static void main(String[] args) {
	int count=0;
	String s1="hi how are you";
	char arr[]=s1.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==' '){
				count++;
		}
		
	}
	System.out.println("no of words: "+(count+1));
}
}
