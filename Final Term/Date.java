import java.util.Scanner;
public class Date {
    int date;
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    void getDate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date in DDMMYYYY format: ");
        date = sc.nextInt();
        sc.close();
    }

    void display() {
        int d = date / 1000000;
        int m = (date / 10000) % 100 ;
        int y = date % 10000;
        System.out.println(d + " / " + m + " / " + y);
        System.out.println(d + " " + month[m - 1] + ", " + y);
    }

    public static void main(String[] args) {
        Date date = new Date();
        date.getDate();
        date.display();
    }
}
