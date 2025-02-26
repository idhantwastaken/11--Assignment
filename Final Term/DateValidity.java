import java.util.Scanner;
public class DateValidity {
    int d, m, y;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    void getDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in DD/MM/YYYY format: ");
        String date = sc.nextLine().trim();
        d = Integer.parseInt(date.substring(0,2));
        m = Integer.parseInt(date.substring(3,5));
        y = Integer.parseInt(date.substring(6));
        sc.close();
    }
    boolean isLeapYear(){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        return false;
    }
    boolean isValidDate(){
        if(y < 1800 || y > 9999)
            return false;
        if(m < 1 || m > 12)
            return false;
        if(m == 2 && isLeapYear())
            days[1] = 29;
        if(d < 1 || d > days[m - 1])
            return false;
        return true;
    }
    public static void main(String[] args) {
        DateValidity ob = new DateValidity();
        ob.getDate();
        if(ob.isValidDate())
            System.out.println("Valid date");
        else
            System.out.println("Invalid date");
    }    
}