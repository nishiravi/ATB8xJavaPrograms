package Task.MasterCoding_InterviewQuestions;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String data=sc.next();
        int left=0;
        int right=data.length()-1;
       boolean ispalindrome=true;
        while(left<=right)
        {
          if(data.charAt(left)!=data.charAt(right))
          {
              ispalindrome=false;
              break;
          }
          left++;
          right--;
        }
        if(ispalindrome==true)
        {
            System.out.println(data +"  is a palindrome");
        }
        else {
            System.out.println(data+ "  is not a palindrome");
        }
    }
}
