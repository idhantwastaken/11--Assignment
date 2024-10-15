import java.util.*;
class SaddlePoint{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix");
        int n = sc.nextInt();
        System.out.println("enter the matrix");
        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int p = 0; p < n; p++){
                a[i][p] = sc.nextInt();
            }
        }
        int min, max, saddle = 0;
        boolean contains_saddle = false;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < a.length; j++) {
                min = a[i][j];
                max = a[i][j];
                for(int p = 0; p < n; p++){
                    if(a[p][j] > max) max=a[p][j];
                    if(a[i][p] < min) min=a[i][p]; 
                }
                if(min == max){
                    System.out.println("The sadle point is " + saddle);
                    contains_saddle=true;
                }
            }
        }
        if(!contains_saddle) System.out.println("No sadle point");
        sc.close();
    }
}