import java.util.Scanner;
class Kaprekar{
    int countDigits(int n){
        int digits = 0;
        while(n > 0){
            digits++;
            n /= 10;
        }
        return digits;
    }
    
    boolean iskaprekar(int n){ 
        int n_square = n * n, digits = countDigits(n_square);
        for (int i = 1; i < digits; i++){ 
            int parts = (int) Math.pow(10, i); 
            int l_part = n_square / parts, r_part = n_square % parts;
            int sum = l_part + r_part;
            if(l_part == 0 || r_part == 0)
            return false;
            else if (sum == n) 
            return true;
        }
        return false;
    } 
    public static void main (String[] args){ 
        Scanner sc = new Scanner(System.in);
        Kaprekar ob = new Kaprekar();
        
        System.out.println("Enter a number");
        // int a = sc.nextInt();
        for(int a = 0; a <= 900000000; a += 10){
            if(ob.iskaprekar(a))
            System.out.println(a + " is a Kaprekar Number");
            // else
            // System.out.println(a + " is not a Kaprekar Number");
        }
        sc.close();
    } 
} 