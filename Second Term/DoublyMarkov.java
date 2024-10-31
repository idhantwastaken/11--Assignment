import java.util.*;
class DoublyMarkov {
    double A[][]; int N;
    void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        N = sc.nextInt();
        while (N < 3 || N > 9) {
            System.out.println("Size of the Matrix must be greater than 2 & less than 10. Try again");
            N = sc.nextInt();
        }
        A = new double[N][N];
        System.err.println("Enter " + (N * N) + " elements");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextDouble();
                while (A[i][j] < 0) {
                    System.out.println("Matrix elements must be positive. Try again");
                    A[i][j] = sc.nextDouble();
                }
            }
        }
        sc.close();
    }
    boolean isDoublyMarkov(){
        for (int i = 0; i < N; i++) {
            double sum1 = 0; double sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum1 += A[i][j];
                sum2 += A[j][i];
            }
            if(sum1 != 1 || sum2 != 1){
                System.out.println(sum1 + " "+ sum2);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        DoublyMarkov ob = new DoublyMarkov();
        ob.getArray();
        boolean isDoublyMarkov = ob.isDoublyMarkov();
        if(isDoublyMarkov)
        System.out.println("The matrix is a Doubly Markov matrix");
        else
        System.out.println("The matrix is not a Doubly Markov matrix");
        
    }
}
