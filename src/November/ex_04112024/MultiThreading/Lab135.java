package November.ex_04112024.MultiThreading;

public class Lab135 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        System.out.println(t);
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + t.getName());
            System.out.println(i + " - " + t.getPriority());
            Thread.sleep(5000);
        }
    }
}
