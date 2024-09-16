package sept.ex_16092024;

public class Lab027_Concatenation_Operator {
    public static void main(String[] args) {

        String firstName="Nishi";
        String lastName="Ravi";
        int c=1;
        int d=2;
        // Conctenation operator
        // + act as concatenation when used to with two strings
        // String + String ,here + is concatenation
        //int +int , here + is assignment operator
        System.out.println(firstName + lastName); // concatenation of two strings
        System.out.println(c + d); // assignment operator
        System.out.println(firstName + lastName + c+d); // Concatenation only as String concatenation is first
        System.out.println(c+d+firstName + lastName ); // first arthmetic operation then concatenation
        System.out.println(firstName + lastName + (c+d)); // concatenation first then arithmetic operation inside the braces
    }
}
