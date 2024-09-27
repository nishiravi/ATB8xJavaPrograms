package sept.ex_20092024.Task_20Sept;

import java.util.Scanner;

public class Lab054_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the 3 sides");
        System.out.println(" enter the first side");
        double side1 = sc.nextDouble();
        System.out.println(" enter the second side");
        double side2 = sc.nextDouble();
        System.out.println(" enter the third side");
        double side3 = sc.nextDouble();
        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {

            if ((side1 == side2) && (side2 == side3) && (side1 == side3)) {
                System.out.println(" triangle is equilateral (all sides are equal),");
            } else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) {
                System.out.println(" triangle is  isosceles (exactly two sides are equal)");
            } else if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
                System.out.println(" triangle is   scalene (no sides are equal).");
            }
        } else {
            System.out.println(" negative value input not accepted");
        }
    }


}
