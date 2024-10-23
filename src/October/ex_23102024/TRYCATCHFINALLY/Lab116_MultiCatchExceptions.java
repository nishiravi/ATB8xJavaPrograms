package October.ex_23102024.TRYCATCHFINALLY;

public class Lab116_MultiCatchExceptions {
    public static void main(String[] args) {
        try {
           String ip = args[0];
            int a = Integer.parseInt(ip);
            int b = 100 / a;

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executed");
        }
    }
}
