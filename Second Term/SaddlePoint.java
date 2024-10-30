import java.util.Scanner;
class SaddlePoint{
    int A[][]; int N;
    void getArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        N = sc.nextInt();
        System.out.println("Enter the matrix");
        A = new int[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                A[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
    
    void findSaddlePoint(){
        int min, max;
        boolean contains_saddle = false;
        for(int i = 0; i < N; i++){
            for (int j = 0; j < N; j++) {
                min = A[i][j];
                max = A[i][j];
                for(int p = 0; p < N; p++){
                    if(A[p][j] > max) max=A[p][j];
                    if(A[i][p] < min) min=A[i][p]; 
                }
                if(min == max){
                    System.out.println("The sadle point is " + min);
                    contains_saddle=true;
                }
            }
        }
        if(!contains_saddle) System.out.println("No sadle point");
    }
    public static void main(String args[]){
        SaddlePoint ob = new SaddlePoint();
        ob.getArray();
        ob.findSaddlePoint();
    }
}