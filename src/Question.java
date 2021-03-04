import java.util.ArrayList;

public class Question {
    Question[] q;
    private String question;
    private int answer, rightanswer;

    public Question (String question, int rightanswer) {
        this.rightanswer = rightanswer;
        this.question = question;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
