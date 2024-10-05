import java.util.*;
public class EvilOrOdious {
    String toString(int n){
        String bin = "";
        while(n > 0){
            if(n % 2 == 0) bin += "0";
            else bin += "1";
            n /= 2;
        }
        return bin;
    }
    
    void evilOdious(int n){
        String str = toString(n); int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') count++;
        }
        if(count % 2 == 0) System.out.println(n + " is evil");
        else System.out.println(n + " is odious");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvilOrOdious ob = new EvilOrOdious();
        System.out.println("Enter a number");
        int n = sc.nextInt();
        ob.evilOdious(n);
        sc.close();
        
    }
}
