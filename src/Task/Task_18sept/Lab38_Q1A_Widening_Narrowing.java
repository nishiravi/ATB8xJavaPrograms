package Task.Task_18sept;

public class Lab38_Q1A_Widening_Narrowing {

    public static void main(String[] args) {

        // Widening - Implicit casting
        char a='B';
        float b=a;
        System.out.println(b);
        // Widening - Explicit casting
        int c=15;
        double d=(long)c;
        System.out.println(d);

        //Narrowing -implicit casting;

        //float a1=10.11f;
        //int b1=a1; // implicit casting invalid

        //Narrowing -explicit casting
        float a2=687796.45f;
        char a3=(char)a2;
        System.out.println(a3);




    }
}
