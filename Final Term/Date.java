//QUESTION 2
import java.util.Scanner;
public class Date {
    int date;
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    void getDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in DDMMYYYY format: ");
        date = sc.nextInt();
        sc.close();
    }
    
    boolean isValidDate(int d, int m, int y){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            days[1] = 29;
        if(m < 1 || m > 12)
            return false;
        if(d < 1 || d > days[m - 1])
            return false;
        return true;
    }
    
    void display() {
        int d = date / 1000000;
        int m = (date / 10000) % 100 ;
        int y = date % 10000;
        if(isValidDate(d, m, y)){
            System.out.println(d + " / " + m + " / " + y);
            System.out.println(d + " " + month[m - 1] + ", " + y);
        }
        else System.out.println("Invalid Date.");
    }
    
    public static void main(String[] args) {
        Date ob = new Date();
        ob.getDate();
        ob.display();
    }
}