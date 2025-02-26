import java.util.Scanner;
public class SubDate {
    int d, m, y, d2, m2, y2;
    int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    void getDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date 1 in DD/MM/YYYY format: ");
        String date = sc.nextLine().trim();
        d = Integer.parseInt(date.substring(0,2));
        m = Integer.parseInt(date.substring(3,5));
        y = Integer.parseInt(date.substring(6));
        System.out.print("Enter the date 2 in DD/MM/YYYY format: ");
        String date2 = sc.nextLine().trim();
        d2 = Integer.parseInt(date2.substring(0,2));
        m2 = Integer.parseInt(date2.substring(3,5));
        y2 = Integer.parseInt(date2.substring(6));
        sc.close();
    }
    
    boolean isValidDate(int d, int m){
        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
            days[1] = 29;
        if(m < 1 || m > 12)
            return false;
        if(d < 1 || d > days[m - 1])
            return false;
        return true;
    }
    
    void calculate(){
        if(isValidDate(d, m) && isValidDate(d2, m2))
            System.out.println("Difference: " + (int)Math.abs((d2 - d) + (m2 - m) * 30.43 + (y2 - y) * 365.25) + " days");
        else
            System.out.println("Invalid date");
    }
    
    public static void main(String[] args) {
        SubDate ob = new SubDate();
        ob.getDate();
        ob.calculate();
    }
}