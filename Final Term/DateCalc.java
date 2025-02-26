import java.util.Scanner;
public class DateCalc {
    int d, m = 1, y, dafter, n;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    void getDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day number: ");
        n = sc.nextInt();
        System.out.print("Enter the year: ");
        y = sc.nextInt();
        System.out.print("Enter the date after : ");
        dafter = sc.nextInt();
        sc.close();
    }
    
    boolean isLeapYear(){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        return false;
    }
    
    String findDate(int n) {
        if (isLeapYear())
            days[1] = 29;
        d += n;
        while(d > days[m - 1]){
            d -= days[m - 1];
            m++;
            if(m > 12){
                m = 1;
                y++;
                if (isLeapYear())
                days[1] = 29;
                else
                days[1] = 28;
            }
        }
        return (d + "/" + m + "/" + y);
    }
    
    void display() {
        if (n < 1 || n > 366) 
            System.out.println("Invalid Date");
        else if (dafter < 1 || dafter > 100) 
            System.out.println("Invalid Date after");
        else {
            System.out.println("Entered date: " + findDate(n));
            System.out.println("Date after " + dafter + " days: "  + findDate(dafter));
        }
    }
    
    public static void main(String[] args) {
        DateCalc ob = new DateCalc();
        ob.getDate();
        ob.display();
    }
}