import java.util.Scanner;
class Smith {
    int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    int sumOfFactors(int n){
        int sum = 0;
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                if(i < 10)
                sum += i;
                else
                sum += sumOfDigits(i);
            }
        }
        return sum;
    }
    
    boolean isSmith(int n){
        if(sumOfDigits(n) == sumOfFactors(n))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smith ob = new Smith();
        
        System.out.println("Enter a number");
        int a = sc.nextInt();
        
        if(ob.isSmith(a))
            System.out.println(a + " is a Smith Number");
        else
            System.out.println(a + " is not a Smith Number");
            sc.close();
    }
}