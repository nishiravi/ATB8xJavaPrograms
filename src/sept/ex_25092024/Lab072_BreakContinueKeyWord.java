package sept.ex_25092024;

public class Lab072_BreakContinueKeyWord {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
                if (j == 5) {
                    continue;
                }
                System.out.println(" after ");
            }
        }
    }

