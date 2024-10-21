package October.ex_21102024.Exception.CheckedException;

public class Lab120_TryMultipleCatch {

    public static void main(String[] args) {
        int a=10;
        String name=null;
       // System.out.println(name.trim());
        try{
            a=10/a; // / by zero
            System.out.println(name.trim()); //NullPointerException
        } catch (ArithmeticException e) { // Exception is parent of all exception
            System.out.println("exception message is  "+e.getMessage()); // Prints the eception message
            System.out.println(e); // Prints the exception
        }
        catch (Exception e) { // Exception is parent of all exception
            System.out.println("exception message is  "+e.getMessage()); // Prints the eception message
            System.out.println(e); // Prints the exception
        }

        System.out.println("End");
    }
}
