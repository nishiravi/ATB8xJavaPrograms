package October.ex_18102024.Strings;

public class Lab106_StringEqualFunctions {
    public static void main(String[] args) {
            // String constant pool doesnt store a duplicate string value
        String s1="HEllo"; // this is a string literal stored in String constant pool
        String s2=new String("Hi"); // stored in object area
        String s3=new String("Hi");
        String s4="HEllo";
        System.out.println(s1==s2); // Output is false as the location of s1 & s2 is different
        System.out.println(s2==s3); // output is false ,
        // because == operator is validating the memory location value of the refrence variable,
        // s1,s2s,s3 are in different memory locations
        System.out.println(s1==s4); // Output is true

        // how to check the values stored in the object refrence variables
        System.out.println(s2.equals(s3)); // Returns true ;
        System.out.println(s3.equalsIgnoreCase(s4)); // compare by ignoring the case sestiveness
    }
}
