import java.util.Scanner;
class Triangular {
    boolean isTriangular(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum += i;
        }
        if(sum == n) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangular ob = new Triangular();

        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if(ob.isTriangular(a)) System.out.println(a + " is a Triangular number");
        else System.out.println(a + " is not a Triangular number");

        sc.close();
    }
}
