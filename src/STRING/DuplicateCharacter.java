package STRING;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "HelloWorld";
        str = str.toLowerCase();  // convert everything to lowercase

        int freq[] = new int[26]; // 26 letters in English alphabet

        // Count frequency of each alphabet
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {   // only letters
                freq[ch - 'a']++;           // 'a'->0, 'b'->1, ..., 'z'->25
            }
        }

        System.out.print("Repeated alphabets: ");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 1) {              // only letters that repeat
                System.out.print((char)(i + 'a') + " ");  // convert index back to letter
            }
        }
    }
}
