package October.ex_23102024.TRYCATCHFINALLY;

public class Lab115_ExceptionUsingFinally {
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
    }
}
