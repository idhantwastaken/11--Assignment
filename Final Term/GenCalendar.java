import java.util.Scanner;
public class GenCalendar {
    int y;
    String m, mfirst;
    String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String weekday[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    void  input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year and month");
        y = sc.nextInt();
        m = sc.next();
        System.out.println("Enter first day of month");
        mfirst = sc.next();
        sc.close();
    }
    
    void isLeapYear(){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
        days[1] = 29;
    }
    
    void generate() {
        isLeapYear();
        int mno = 0, dno = 0;
        String div = "------------------------------------------------------";
        for (int i = 0; i < month.length; i++)
            if(m.equalsIgnoreCase(month[i]))
                mno = i;
        
        for (int i = 0; i < weekday.length; i++)
            if(mfirst.equalsIgnoreCase(weekday[i]))
                dno = i;
        
        if (dno == 0 || mno == 0){
            System.out.println("Invalid Month / Weekday");
        }
        else{
            // System.out.println(div);                replaced by line 40
            // System.out.println("  " + month[mno] + " " + y);
            // System.out.println(div);
            System.out.printf("%s\n%10s%5d\n%s\n", div, month[mno], y, div);
            System.out.println("  SUN\t  MON\t  TUE\t  WED\t  THU\t  FRI\t  SAT\n" + div);
            
            for (int i = 1; i <= days[mno]; i++) {
                if(i == 1)
                    for (int j = 0; j < dno; j++)
                        System.out.print("\t");
                
                System.out.printf("%4s\t", i);
                if ((i + dno) % 7 == 0)
                    System.out.println("\n" + div);
            }
            System.out.println("\n" + div);
        }
    }
    
    public static void main(String[] args) {
        GenCalendar ob = new GenCalendar();
        ob.input();
        ob.generate();
    }
}