package sept.ex_23092024.Task_23Sept;

public class Lab65_Q3A_ConvertToUnits {
    public static void main(String[] args) {
        double num = 5;
        int choice = 2;
        switch (choice) {
            case 1:
                System.out.println("converting KM to miles");
                System.out.println(num+ "  KM is equal to ");
                num=num*0.621371;
                System.out.println(num + " miles");
                break;
            case 2:
                System.out.println("converting Celsius to Fahrenheit");
                System.out.println(num+ "  Celsius is equal to ");
                num=(num*9/5) +32;
                System.out.println(num + " Fahrenheit");
                break;


        }
    }
}
