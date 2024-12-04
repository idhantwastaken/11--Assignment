/*
* It is a form of enryption technique. A keyword is used as the key. It determines the letter matching cipher alphabet.
* Repeats of letters in word are removed, then the cipher alphabet is generated with the keyword matching to A,B,C etc until the keyword is used up,
* whereupon the rest of the cipher text letters are used in alphabetical order excluding those already in the key
* Write  a program to accept a coded text in uppercase and a keyword using the above technique decrypt the text & display.
*/
import java.util.Scanner;
class KeywordCipher {
    String generateCipher(String key) {
        String cipher = "";
        boolean occured[] = new boolean[26];
        for (int i = 0; i < key.length(); i++) {
            char ch = key.charAt(i);
            int index = (int)(ch - 'A');
            if (!occured[index]) {
                cipher += ch;
                occured[index] = true;
            }
        }
        for (int i = 0; i < occured.length; i++) {
            if(!occured[i])
                cipher += (char)(i + 65);
        }
        return cipher;
    }
    void decrypt(String code, String key){
        String cipher = generateCipher(key);
        String decodedtxt = "";
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (Character.isLetter(ch)) 
                decodedtxt += (char)(cipher.indexOf(ch) + 65);
            else decodedtxt += ch;
        }
        System.out.println("Decrypted String: " + decodedtxt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KeywordCipher ob = new KeywordCipher();
        System.out.print("Enter the coded text:");
        String codedtxt = sc.nextLine();
        System.out.print("Enter the Keyword:");
        String keyword = sc.next();
        ob.decrypt(codedtxt.toUpperCase(),keyword.toUpperCase());
        sc.close();
    }
}
