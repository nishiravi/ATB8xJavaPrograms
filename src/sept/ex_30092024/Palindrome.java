package sept.ex_30092024;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int i=0;
        int j=data.length()-1;
        boolean isInputString=true;
        while(i<j)
        {
            if((data.charAt(i) != data.charAt(j)))
            {
                isInputString=false;
                break;
            }
            i++;
            j--;
        }
        if(isInputString==true)
        {
            System.out.println(data +"is palindrome");
        }
        else {
            System.out.println(data +"is not a palindrome");
        }

    }
}
