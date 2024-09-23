package sept.ex_23092024;

public class Lab066_SwitchCaseWithOperation {
    public static void main(String[] args) {
        char alphabet='A';
        switch (alphabet){
            case 'A':
                System.out.println(" Print A");
                break;
            case 'A'+1:
                System.out.println(" Print B");
                break;
            case 'C':
                System.out.println(" Print C");
                break;
                // below is another code to print C
            //case 'A'+2:
               // System.out.println(" Print C");
               // break;
            case 'A'+3:
                System.out.println(" Print D");
                break;

        }
    }


}
