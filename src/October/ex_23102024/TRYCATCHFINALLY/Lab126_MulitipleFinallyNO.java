package October.ex_23102024.TRYCATCHFINALLY;

public class Lab126_MulitipleFinallyNO {
    public static void main(String[] args) {

        int a=0;
        try{
            int c=10/a;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
           // System.out.println(e.getMessage());
        }finally {
            System.out.println(" Finally block executed");
        }
    //    finally { // Multiple Finally block not allowed
            System.out.println(" Finally block executed");
       // }
        System.out.println("LAst statements"); // executed only if the code work without issue
    }
}
