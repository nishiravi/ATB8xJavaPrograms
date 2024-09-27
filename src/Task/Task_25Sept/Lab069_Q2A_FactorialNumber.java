package Task.Task_25Sept;

public class Lab069_Q2A_FactorialNumber {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        int i=n;
        while(i>0)  {
            fact=fact*i;
            i--;
        }
       System.out.println(fact);
   }
}
