import java.util.Scanner;
class TimeinWords {
    int h, m;
    String fisrt20[] = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    String tens[] = { "Twenty", "Thirty", "Forty", "Fifty" };
    
    void getTime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time as HH,MM");
        String time = sc.nextLine();
        h = Integer.parseInt(time.substring(0,2));
        m = Integer.parseInt(time.substring(3));
        sc.close();
    }
    
    String convertToWords(int n) {
        if(n < 20) 
        return fisrt20[n-1];
        else
        return tens[(n / 10) - 2];
    }
    
    void convertTime(){
        if(m >= 0 && m < 60 && h > 0 && h <= 12){
            if(m == 0) System.out.println(fisrt20[h -1] + " o' clock");
            if(m == 15) System.out.println("quarter past "+fisrt20[h]);
            if(m == 30) System.out.println("half past "+fisrt20[h]);
            if(m == 45) System.out.println("quarter to "+fisrt20[h]);
            if(m > 30) System.out.println(convertToWords(60-m)+" minutes to "+fisrt20[h]);
            if(m < 30){
                if(m == 1) System.out.println(convertToWords(m)+" minute past "+fisrt20[h-1]);
                else System.out.println(convertToWords(m)+" minutes past "+fisrt20[h-1]);
            }
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