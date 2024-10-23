package October.ex_23102024.TRYCATCHFINALLY;

public class Lab117_MultiCatchException_OR {
    public static void main(String[] args) {
        try {
           String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;

        } catch (NumberFormatException |ArithmeticException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
