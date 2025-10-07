package STRING;

import java.util.Iterator;

public class CompareString {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hellg3";
		if (s1.length() != s2.length()) {
			System.out.println("not equal");
			return;
			
			
		}
		else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					System.out.println("not pali");
					return;
					
				}
				
			}
		}
		System.out.println("its pali");
	}

}
