package Task.Task_18Oct;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abba";
        int j=str.length()-1;
        boolean palindrome=true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=str.charAt(j))
            {
                System.out.println(" not a palindrome");
                palindrome=false;
              break;

           }
            j--;
       }
  if(palindrome)
      System.out.println(" yes its a palindrome");
    }
}
