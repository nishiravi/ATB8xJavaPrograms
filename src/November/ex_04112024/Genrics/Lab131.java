package November.ex_04112024.Genrics;

public class Lab131 {
    public static void main(String[] args) {
        //## **Generics**
        //- "Generics allow the reusability of code,
        // where one single method can be used for different data-types of variables or objects."
        //- idea is to allow different types like Integer, String, … etc and
        // user-defined types to be a parameter to methods, classes, and interfaces.
        temp(1);
        temp("nishi");
        temp(true);
    }
    // T-> is just a refrence , it can be any data type
    public static <T>  void temp(T a)
    {
        System.out.println(a);
    }
}
