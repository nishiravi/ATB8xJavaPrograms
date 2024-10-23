package October.ex_23102024.TRYCATCHFINALLY;

public class Lab118_UsingException {
    public static void main(String[] args) {
        try {
           String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;

        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
