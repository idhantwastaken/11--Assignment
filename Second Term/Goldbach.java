import java.util.*;
class Goldbach{
    boolean isPrime(int a){
        for(int i = 2; i <= a / 2; i++){
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
    void oddnumberpairs(int a){
        System.out.println("Odd number pairs:");
        for(int i = 3; i <=  a / 2; i++){
            if(isPrime(i)){
                if(isPrime(a - 1))
                    System.out.println(i + ", " + (a - i));
            }
        }
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Goldbach ob = new Goldbach();
        System.out.println("Enter an even number");
        int N = sc.nextInt();
        while(N < 5 || N > 50){
            System.out.println("Entered number must be >5 and <50. Try again.");
            N = sc.nextInt();
        }
        if(N % 2 == 0){
            ob.oddnumberpairs(N);
        }
        else System.out.println("Entered number must be even");
    }
}
