package October.ex_21102024.Exception.UncheckedException;

public class Lab116_ArithmeticException {
    public static void main(String[] args) {

        System.out.println(" Start of the Program");
        String  a="0";
        int b=Integer.parseInt(a);
        int c= 1000/b; //ArithmeticException : 1000/0
        System.out.println(c);
        System.out.println(" End of the Program");
    }

}
