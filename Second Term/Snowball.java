import java.util.Scanner;
import java.util.StringTokenizer;
class Snowball{
    String str;
    StringTokenizer obj;
    void getSentence(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        str = sc.nextLine();
        obj  = new StringTokenizer(str, " ,.?");
        sc.close();
    }

    void isSnowballSentence(){
        if(!str.endsWith(".") && !str.endsWith("?")) {
            System.out.println("The sentence should end with \'.\' or \'?\'. Not " + str.charAt(str.length() - 1));
        }
        else {
            int reqLength = 0;
            boolean a = true;
            for (int i = 0; i < obj.countTokens(); i++) {
                String st = obj.nextToken();
                if(i == 0) reqLength = st.length() + 1;
                if(st.length() == reqLength) {
                    reqLength++;
                }
                else {
                    System.out.println("The Entered sentence is not a snowball sentence");
                    a = false;
                    break;
                }
            }
            if(a)
                System.out.println("The Entered sentence is a snowball sentence");
        }
    }

    public static void main(String[] args) {
        Snowball ob = new Snowball();
        ob.getSentence();
        ob.isSnowballSentence();
    }
}

// is the cold water frozen.
