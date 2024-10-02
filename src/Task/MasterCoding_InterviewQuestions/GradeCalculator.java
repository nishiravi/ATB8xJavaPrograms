package Task.MasterCoding_InterviewQuestions;

import java.util.Scanner;

public class GradeCalculator {

    //Write a program that calculates and displays the letter
    // grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=90 && score<100)
            System.out.println("Score is"+score +"Grade A");
        else if(score>=80 && score<=89)
            System.out.println("Score is"+score +"Grade B");
        else if(score>=70 && score<=79)
            System.out.println("Score is"+score +"Grade C");
        else if(score>=60 && score<=69)
            System.out.println("Score is"+score +"Grade D");
        else if (score>=0 && score<=59)
            System.out.println("Score is"+score +"Grade F");
        else if(score<0 || score>100)
            System.out.println("invalid score input");
    }
}
