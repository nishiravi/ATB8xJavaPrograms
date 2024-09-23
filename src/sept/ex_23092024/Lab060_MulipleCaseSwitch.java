package sept.ex_23092024;

public class Lab060_MulipleCaseSwitch {
    public static void main(String[] args) {

        char alphabet='k';
        switch (alphabet){
            case 'A','B','C':
                System.out.println(" uppercase letters  " +alphabet);
                break;
            case 'a','b','c':
                System.out.println(" lowercase letters  "  +alphabet);
                break;
            default:
                System.out.println(" no match");

        }
    }
}
