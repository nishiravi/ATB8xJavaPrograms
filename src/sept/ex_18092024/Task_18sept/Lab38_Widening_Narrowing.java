package sept.ex_18092024.Task_18sept;

public class Lab38_Widening_Narrowing {

    public static void main(String[] args) {

        // Widening - Implicit casting
        char a='B';
        float b=a;
        System.out.println(b);
        // Widening - Explicit casting
        int c=15;
        double d=(long)c;
        System.out.println(d);

    }
}
