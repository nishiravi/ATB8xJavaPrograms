package sept.ex_18092024;

public class Lab37_TypeCasting {
    public static void main(String[] args) {
        //Type Casting
        // Widening & Narrowing
        //  Implicit casting means casting will be done by JVM itself , no seprate code needed
        // Explicit casting means we will write code explicitly for casting

        // Widening - inserting smaller data into bigger storage container
        // both implicit and explicit are possible
        byte a = 10;
        int b = a; // implicit casting
        int a1 = (int) a; // Explicit casting

        // Narrowing-inserting bigger data into smaller storage container-so there is loss of data
        // JVM doesnt allow implicit casting
        // if we do explicit casting then their will be loss of data

        int c=300;
       // byte d=c; --invalid implicit cast
        byte e=(byte)c; // valid explicit convertion , but loss of data



    }

}