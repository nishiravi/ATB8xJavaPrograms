package Task.MasterCoding_InterviewQuestions;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(" table of "+ num + "is");
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d",num,i,num*i);
            System.out.println();
        }
    }
}
