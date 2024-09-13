package sept.ex_13092024;

public class Lab21_Literals {
    public static void main(String[] args) {

        // Literals-Boolean,Integer,Char
        //Single char
        char a='A'; //ASCII value of A is stored in variable a;
        char b='B';  //ASCII value of B is stored in variable b;
        System.out.println(a );
        System.out.println(b );
        //Escape  char Literals
        char new_line='\n';
        char tab_line='\t';
        char back_line='\b';
        char car_r='\r';
        System.out.println("Nishi"+new_line+"Ravi");
        System.out.println("Nishi"+tab_line+"Ravi");
        System.out.println("Nishi"+back_line+"Ravi");
        System.out.println("Nishi"+car_r+"Ravi");
        // String literals
        String name="Nishi";
        System.out.println(name);
        //null literal -supported by non primitive data type
        String s1=null;
    }
}
