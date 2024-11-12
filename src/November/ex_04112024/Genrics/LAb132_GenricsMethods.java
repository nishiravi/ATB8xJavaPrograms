package November.ex_04112024.Genrics;

public class LAb132_GenricsMethods {
    public static void main(String[] args) {
        printTS(10,20,30);
    }
    // T-> is just a refrence , it can be any data type
    public static <T1,T2,T3>  void printTS(T1 a, T2 b, T3 c)
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
