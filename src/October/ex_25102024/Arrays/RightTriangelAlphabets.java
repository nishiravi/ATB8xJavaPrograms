package October.ex_25102024.Arrays;

import java.util.Scanner;

public class RightTriangelAlphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char k='A';
        for(int i=0;i<n;i++,k++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k);
                
            }
            System.out.println();
        }
        
    }
}
