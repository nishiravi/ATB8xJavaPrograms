package sept.ex_20092024;

public class Lab046_MaxOf3Number {
    public static void main(String[] args) {

        // maximum between 2 numbers
        int a=10;
        int b=20;
        int c=45;
        int max=((a>b?a:b))>c ? ((a>b?a:b)): c;
        // int max=((a>b)
        System.out.println(max + " is the maximum number");
        int min=((a<b?a:b))<c ?(a<b?a:b): c;
        System.out.println(min + " is the minimum number");
    }
}
