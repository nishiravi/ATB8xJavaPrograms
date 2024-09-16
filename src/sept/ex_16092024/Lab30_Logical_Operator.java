package sept.ex_16092024;

public class Lab30_Logical_Operator {
    public static void main(String[] args) {
        // Logical opertaor gives boolean value as output
        // !, && ,||
        boolean  a= true;
        boolean  b=false;
        boolean c;
        c= a && b;
        System.out.println(c);
        System.out.println(!c);
        c=a || b;
        System.out.println(c);
       System.out.println(!(10>20));
       System.out.println(!!!(10==20));
        System.out.println(a==b);

    }
}
