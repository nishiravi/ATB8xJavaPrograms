package sept.ex_18092024;

public class Lab041_Increment_Practice {
    public static void main(String[] args) {
        int a=5;
        System.out.println(a++ + a); // Consider A=a++ which means Assign A=5 ,then increment value of a=6
        // now B=a which means B=6;
        // so A+ B= a++ + a= 5+6=11

        int b=10;
        System.out.println(b++ + ++b); // Consider A=b++ which means Assign A=10 ,then increment value of b=11
        // now B=++b which means B=12;
        // so A+ B= b++ + ++b= 10+12=22;
        System.out.println(b); // just print the current value
        System.out.println(++b); // when  b used in next line increment the value so b=13;
        System.out.println(b++); // b value will be 13

        int c=10;
        System.out.println(++c + ++c); // 11 +12 =24 A=++c = 11  , B=++c =12
        System.out.println(c); //12

        int d=10;
        System.out.println(++d + d++ + d++);
        // A= ++d, A=11 , d=11
        //B=d++ , B=11 , d=12;
        //C=d++ , C=12, d=13
        //A+B+C= 11+11+12=34
        System.out.println(d); //13


    }
}
