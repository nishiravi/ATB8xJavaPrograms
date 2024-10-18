package October.ex_18102024.Strings;

public class Lab105 {
    public static void main(String[] args) {
        // String values are stored in the String Constant pool ,
        // bellow latest assignment to the variable name is " Sangeeth but still
        // the names : Nishi and Shriyan will be  present in the pool memory
        String name="Nishi";
        name="Shriyan";
        name="Sangeeth";

        // obj memory space will be created in the heap memory/Object Area and stored with string "geetha"
        String obj=new String("Geetha");
    }
}
