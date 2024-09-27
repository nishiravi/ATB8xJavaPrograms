package Task.Task_23Sept;

public class Lab063_Q1A_SimpleCalaculator {
    public static void main(String[] args) {

        int num1=10;
        int num2=2;
        String operation="%";
        switch (operation){
            case "+":
                System.out.println("addition of 2 numbers is  "+(num1+num2));
                break;
            case "-":
                System.out.println("subtraction of 2 numbers is  "+(num1-num2));
                break;
            case "*":
                System.out.println("multiplication of 2 numbers is  "+(num1*num2));
                break;
            case "/":
                System.out.println("division of 2 numbers is  "+(num1/num2));
                break;
            case "%":
                System.out.println("modulus of 2 numbers is  "+(num1%num2));
                break;
            default:
                System.out.println(" operation not matched ");
        }
    }
}
