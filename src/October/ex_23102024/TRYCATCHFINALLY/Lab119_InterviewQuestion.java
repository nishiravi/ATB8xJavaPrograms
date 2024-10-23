package October.ex_23102024.TRYCATCHFINALLY;

public class Lab119_InterviewQuestion {
    public static void main(String[] args) {
        try {
           String ip = args[0]; // ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);
            int b = 100 / a; //NumberFormatException
            String s1="Nishi";
            System.out.println(s1.trim()); //NullPointerException

        } catch (NumberFormatException |ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
