import java.util.Scanner;
class PrimeAdam{
    boolean isPrime(int n){
        if(n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if(n % i == 0)
            return false;
        }
        return true;
    }
    
    int reverse(int n){
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeAdam obj = new PrimeAdam();
        
        System.out.print("Enter a number");
        int a = sc.nextInt();
        
        if(obj.isPrime(a) == false)
            System.out.println(a + " is not Prime Adam");
        else{
            int rev_a = obj.reverse(a);
            if(a * a == obj.reverse(rev_a * rev_a))
                System.out.println(a + " is Prime Adam");
            else
                System.out.println(a + " is not Prime Adam");
        }
        sc.close();
    }
}