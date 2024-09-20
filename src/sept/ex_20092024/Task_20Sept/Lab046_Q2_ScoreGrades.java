package sept.ex_20092024.Task_20Sept;

public class Lab046_Q2_ScoreGrades {
    public static void main(String[] args) {
        //Condition
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        int score = 85;
        String grade=(score >=90) ?  "A":(( score >=80)? "B" : "C");
        System.out.println(grade);

    }
}
