package sept.ex_20092024;

public class Lab045_MaxOf2Number {
    public static void main(String[] args) {

        // maximum between 2 numbers
        int a=10;
        int b=2;
        int max= (a>b)? a:b;
        System.out.println(max + " is the maximum number");
        int min=(a<b) ? a:b;
        System.out.println(min + " is the minimum number");
    }
}
