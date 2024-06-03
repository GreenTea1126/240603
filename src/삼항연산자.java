import javax.swing.*;

public class 삼항연산자 {
    public static void main(String[] args) {
        int score = 95;
        char grader = (score > 90) ? 'A' : 'B';
//        참이면 a 아니면 b
        int scoreA = 95;
        String grade = (score == 95 && scoreA % 5 == 0) ? "good" : "bad";
        System.out.println(grade);
        }

    }
}
