import java.util.ArrayList;

public class Question {
    private String question;
    private int answer, rightanswer;

    public Question() {}

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setRightanswer(int rightanswer) {
        this.rightanswer = rightanswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public int getAnswer() {
        return answer;
    }

    public int getRightanswer() {
        return rightanswer;
    }

    public void printQuestion() {
        System.out.println(question);
    }
}
