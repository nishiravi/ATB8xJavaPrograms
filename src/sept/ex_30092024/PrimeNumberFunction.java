package sept.ex_30092024;

import java.util.Scanner;

public class PrimeNumberFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        primeNumber(num);
    }
    public static void  primeNumber(int n)
    {
        boolean isprime=true;
      if(n>1){
      for(int i=1;i<=n;i++) {
          if (i > 1) {
              for (int j = 2; j < i; j++) {
                  if (i % j == 0) {
                      isprime = false;
                      break;
                  }
              }
              if (isprime == true) {
                  System.out.println(i + " is a prime number");
              }
          }
      }
      }
      else {
          System.out.println(" invalid number ");
      }
    }
}
