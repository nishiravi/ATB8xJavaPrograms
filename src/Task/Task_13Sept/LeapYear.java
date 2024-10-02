package Task.Task_13Sept;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
       boolean  isLeapYear= false;
       if((year%4==0 && year%100 !=0 ) || year %400==0)
       {
           isLeapYear=true;
       }
       if (isLeapYear==true)
       {
           System.out.println(year +"is a leap year");
       }
       else
       {
           System.out.println(year + " is not leap year");
       }
    }
}
