import java.util.Scanner;
public class MatrixOperation {
    int M, N; int A[][];
    void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        M = sc.nextInt();
        N = sc.nextInt();
        while(M < 2 || M > 10) {
            System.out.println("The number of rows must be greater than 2 and less tan 10.Try Again");
            M = sc.nextInt();
        }
        while(N < 2 || N > 10) {
            System.out.println("The number of must be greater than 2 and less tan 10.Try Again");
            N = sc.nextInt();
        }
        A = new int[M][N];
        System.out.println("Enter " + (M * N) + " numbers");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
    }
    void rotation() {
        int p1 = 0, p2 = M - 1, product = M * N;
        for(int i = 0; i < product;){
            for(int j = 0; j < N; j++) {
                int temp = A[p1][j];
                A[p1][j] = A[p2][j];
                A[p2][j] = temp;
                i++;
            }
            p2--;
        }
    }
    void greatestElement(){
        int max = A[0][0], row = 0, col = 0;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++) {
                if(A[i][j] > max){
                    max = A[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Highest element: " + max + " Row: " + row + " Column: " + col);
    }
    void display(){
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        MatrixOperation ob = new MatrixOperation();
        ob.getArray();
        System.out.println("Original Matrix");
        ob.display();
        ob.rotation();
        System.out.println("Rotated Matrix");
        ob.display();
        ob.greatestElement();
    }
}