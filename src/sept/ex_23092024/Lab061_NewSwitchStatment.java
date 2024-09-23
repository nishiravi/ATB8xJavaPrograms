package sept.ex_23092024;

public class Lab061_NewSwitchStatment {
    public static void main(String[] args) {
       // switch statement with multiple case conditions but only  single statement
        int code=4;
        switch (code){
            case 1-> System.out.println(" its number " + code);
            case 2-> System.out.println(" its number " + code);
            case 3,4-> System.out.println(" its number " + code);
            default-> System.out.println(" its number " + code);
        }
    }
}
