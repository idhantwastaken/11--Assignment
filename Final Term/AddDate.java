import java.util.Scanner;
public class AddDate {
    int d, m, y, n;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    void getDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in DD/MM/YYYY format: ");
        String date = sc.nextLine().trim();
        d = Integer.parseInt(date.substring(0,2));
        m = Integer.parseInt(date.substring(3,5));
        y = Integer.parseInt(date.substring(6,10));
        System.out.println("Enter number of days: ");
        n = sc.nextInt();
        sc.close();
    }

    boolean isLeapYear(){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            return true;
        return false;
    }

    boolean isValidDate(){
        if(m < 1 || m > 12)
            return false;
        if(d < 1 || d > days[m - 1])
            return false;
        return true;
    }

    void calculate(){
        if(isValidDate()){
            System.out.println("Entered date is: " + d + "/" + m + "/" + y);
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
            System.out.printf("New date is: " + d + "/" + m + "/" + y);
        }
        else
            System.out.println("Invalid date");
    }

    public static void main(String[] args) {
        AddDate ob = new AddDate();
        ob.getDate();
        ob.calculate();
    }
}