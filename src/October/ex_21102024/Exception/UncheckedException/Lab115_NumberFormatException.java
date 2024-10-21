package October.ex_21102024.Exception.UncheckedException;

public class Lab115_NumberFormatException {
    public static void main(String[] args) {

        System.out.println(" Start of the Program");
        String  a="Pramod";
        int b=Integer.parseInt(a); // NumberFormatException
        int c= 1000/b;
        System.out.println(c);
        System.out.println(" End of the Program");
    }

}
