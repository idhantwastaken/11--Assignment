import java.util.*;
class DoublyMarkov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int N = sc.nextInt();
        while (N < 3 || N > 9) {
            System.out.println("Size of the Matrix must be greater than 2 & less than 10. Try again");
            N = sc.nextInt();
        }
        double M[][] = new double[N][N];
        System.err.println("Enter " + (N * N) + " elements");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = sc.nextDouble();
                while (M[i][j] < 0) {
                    System.out.println("Matrix elements must be positive. Try again");
                    M[i][j] = sc.nextDouble();
                }
            }
        }
        
        boolean isMarkov = false;
        for (int i = 0; i < N; i++) {
            int sum1 = 0; int sum2 = 0;
            for (int j = 0; j < N; j++) {
                sum1 += M[i][j];
                sum2 += M[j][i];
            }
            if(sum1 != 1 || sum2 != 1){
                System.out.println("The matrix is not Doubly Markov");
                isMarkov = false;
                break;
            }
            else isMarkov = true;
        }
        if (isMarkov) {
            System.out.println("Matrix is Doubly Markov");
        }
        sc.close();
    }
}
