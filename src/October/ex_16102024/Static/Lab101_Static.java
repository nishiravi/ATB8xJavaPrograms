package October.ex_16102024.Static;

public class Lab101_Static {
    public static void main(String[] args) {
        ATB8X obj1=new ATB8X("nishi","7418529632");
        ATB8X obj2=new ATB8X("sang","7418129632");
        ATB8X obj3=new ATB8X("shriyan","7018529632");
        obj1.readDocumnet(); // Accessing non static method using the object refrence variable
        ATB8X.doAssignment(); // accessing the static method from ATB8X class


    }
}
