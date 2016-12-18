package college.edu.tomer.intentsdemo.Module;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by khaled on 20/08/2016.
 */
public class Question {
    String quest;
    String[] answers = new String[4];
    int correctAnswer;

    public Question(String quest, String[] answers, int correctAnswer) {
        this.quest = quest;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean correctAnswer(int userAnswerIndex) {
        return (userAnswerIndex == correctAnswer);
    }


    public String getQuest() {
        return quest;
    }

    public void dispQuestionWithAnswers(TextView tvQuestion, Button btn0, Button btn1, Button btn2, Button btn3) {

            tvQuestion.setText(quest);

            btn0.setText(answers[0]);
            btn1.setText(answers[1]);
            btn2.setText(answers[2]);
            btn3.setText(answers[3]);


    }

}