package Task.Task_25Sept;

public class Lab068_Q1A_Table {
    public static void main(String[] args) {

        int n=10;

        System.out.println(" table using for loop");
         for (int i=1;i<=n;i++)
         {
             int a=n*i;
             System.out.println(a);
         }
         System.out.println(" table using while loop");
         int j=1;
         while (j<=n){
             int b=j*n;
             System.out.println(b);
             j++;
         }
    }
}
