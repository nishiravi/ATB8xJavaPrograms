package October.ex_21102024.Exception.CheckedException;

public class Lab119_MultiplrTryMultipleCatch {

    public static void main(String[] args) {
        int a=0;
        String name=null;
       // System.out.println(name.trim());
        try{
            a=10/a; // / by zero
        } catch (Exception e) { // Exception is parent of all exception
            System.out.println("exception message is  "+e.getMessage()); // Prints the eception message
            System.out.println(e); // Prints the exception
        }
        try{
            System.out.println(name.trim()); // NullPointerException
        } catch (Exception e) { // Exception is parent of all exception
            System.out.println("exception message is  "+e.getMessage()); // Prints the eception message
            System.out.println(e); // Prints the exception
        }

        System.out.println("End");
    }
}
