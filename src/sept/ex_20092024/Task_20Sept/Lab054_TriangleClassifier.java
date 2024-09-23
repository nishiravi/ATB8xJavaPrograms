package sept.ex_20092024.Task_20Sept;

public class Lab054_TriangleClassifier {
    public static void main(String[] args) {
        int side1=5;
        int side2=1;
        int side3=2;
        if ((side1==side2) && (side2==side3) && (side1==side3))
        {
            System.out.println(" triangle is equilateral (all sides are equal),");
        } else if ((side1==side2) || (side2==side3) || (side1==side3))
        {
            System.out.println(" triangle is  isosceles (exactly two sides are equal)");
        }
        else if ((side1!=side2) && (side2!=side3) && (side1!=side3))
        {
            System.out.println(" triangle is   scalene (no sides are equal).");
        }
    }


}
