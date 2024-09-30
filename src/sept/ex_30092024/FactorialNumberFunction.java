package sept.ex_30092024;

import java.util.Scanner;

public class FactorialNumberFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       System.out.println("factorial of number  "+num +"is" + factorial(num));
    }
    public static int factorial(int num) {
        int fact = num;
        for (int i = 1; i < num; i++) {
            fact = fact * (num - i);
        }
        return fact;

    }
}
