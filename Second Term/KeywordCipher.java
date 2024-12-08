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
        for (int i = 0; i < 26; i++) {
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