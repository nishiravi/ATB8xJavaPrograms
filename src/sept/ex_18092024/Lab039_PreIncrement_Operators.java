package sept.ex_18092024;

public class Lab039_PreIncrement_Operators {
    public static void main(String[] args) {
        // Pre increment - first increment then print;
        int a=10;
        int b=++a; //b=a+1 incremented value of a
        int a1=21;
        int c=15;
        int d=++c;
        System.out.println(a); // a is 11;
        System.out.println(b); // b is 11
        System.out.println(++a1); // incremented before printing a1 is 22
        System.out.println(a1); // just print a1 value which is 22
        System.out.println(++a1);// a1 will be changed to 23
        System.out.println(d);
        System.out.println(d+a1); //  d is post incremented with c value so d is  16 a1 is 23 , 15+


    }
}
