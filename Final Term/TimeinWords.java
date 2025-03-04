//QUESTION 7
import java.util.Scanner;
class TimeinWords {
    int h, m;
    String fisrt20[] = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    String tens[] = { "Twenty", "Thirty", "Forty", "Fifty" };
    
    void getTime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time as HH,MM: ");
        String time = sc.nextLine();
        h = Integer.parseInt(time.substring(0,2));
        m = Integer.parseInt(time.substring(3));
        sc.close();
    }
    
    String convertToWords(int n) {
        if(n < 20) 
        return fisrt20[n - 2];
        else
        return tens[(n / 10) - 2];
    }
    
    void convertTime(){
        if(m >= 0 && m < 60 && h > 0 && h <= 12){
            System.out.print("Time: ");
            if(m == 0) System.out.println(fisrt20[h - 2] + " o' clock");
            else if(m == 1) System.out.println("One minute past " + fisrt20[h - 2]);
            else if(m == 15) System.out.println("Quarter past " + fisrt20[h - 2]);
            else if(m == 30) System.out.println("Half past " + fisrt20[h - 2]);
            else if(m == 45) System.out.println("Quarter to " + fisrt20[h - 1]);
            else if(m == 59) System.out.println("One minute to " + fisrt20[h - 1]);
            else if(m < 30) System.out.println(convertToWords(m) + " minutes past " + fisrt20[h - 2]);
            else System.out.println(convertToWords(60 - m)+" minutes to " + fisrt20[h - 1]);
        }
        else
        System.out.println("Time is Invalid");
        
    }
    public static void main(String args[]) {
        TimeinWords ob = new TimeinWords();
        ob.getTime();
        ob.convertTime();
    }
}