package October.ex_21102024.Exception.UncheckedException;

public class Lab114_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        System.out.println(" Start of the Program");
        String  a=args[0] ;//10- given in CLI
        //String a2=args[1];ArrayIndexOutOfBoundsException
        int b=Integer.parseInt(a); // converting String to Integer
        int c= 1000/b;
        System.out.println(c);
        System.out.println(" End of the Program");
    }
    // Execution start process
    // 1 . JVM will be initialized From RAM
    //2. Creates and starts Main Thread- Main will be called
    // 3. Collect the  CLI arguments
    // 4. remaining statements inside the main method will be executed

}
