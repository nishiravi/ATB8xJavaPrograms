package Task.Task_27Sept;

import java.util.Scanner;

public class Lab075_Q1A_DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the value to validate while loop");
        int i = sc.nextInt();

        while (i <= 10) {  // while loop:input value more than 10,as the condition become false it doesnt allow to enter the loop,
            System.out.println(i);
            i++;
        }
        System.out.println(" enter the value to validate do  while loop");
        int j = sc.nextInt();
        do {
            System.out.println("value is " + j);
            j++;

        } while (j <= 10); // do-while loop : Input value more than 10, once can  enter the loop and execute, then the condition is checked

    }
}
