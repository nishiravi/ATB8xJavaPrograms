package Task.MasterCoding_InterviewQuestions;

public class LeftTrianglePattern {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print space
            }
            // Inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
