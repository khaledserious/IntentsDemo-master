package college.edu.tomer.intentsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import college.edu.tomer.intentsdemo.Module.Question;


public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvQuestion;
    Button btn0,btn1,btn2,btn3;

    ArrayList<Question> questions = new ArrayList<>();
    private Question q;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        btn0 = (Button) findViewById(R.id.rbAns0);
        btn1 = (Button) findViewById(R.id.rbAns1);
        btn2 = (Button) findViewById(R.id.rbAns2);
        btn3 = (Button) findViewById(R.id.rbAns3);


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

        addQuestions();
        nextQuestion(null);

        }


    public void onClick(View v) {

            checkQuestion(v);
            nextQuestion(null);


    }








private boolean checkQuestion(View v) {
        int userAnswerIndex = checkedIndex(v);
        if (q.correctAnswer(userAnswerIndex)) {
            score++;
            Toast.makeText(DetailsActivity.this, "Correct", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(DetailsActivity.this, "wrong", Toast.LENGTH_SHORT).show();
            return false;
        }
    }


    public int checkedIndex(View v) {
        int userAnswerIndex = -1;
        int checked = v.getId();
        if (checked == R.id.rbAns0) {
            userAnswerIndex = 0;
        } else if (checked == R.id.rbAns1) {
            userAnswerIndex = 1;
        } else if (checked == R.id.rbAns2) {
            userAnswerIndex = 2;
        } else if (checked == R.id.rbAns3) {
            userAnswerIndex = 3;
        }
        return userAnswerIndex;
    }

    private void addQuestions() {
        Question q1 = new Question("5! = ?", new String[]{"120", "24", "720", "110"}, 0);
        Question q2 = new Question("What is the capital of the USA", new String[]{"London", "Chicago", "New York", "Washington"}, 2);
        Question q3 = new Question("What was the prior last name of shimon peres?", new String[]{"paras", "perszon", "presky", "parsingson"}, 3);

        questions.add(q1);
        questions.add(q2);
        questions.add(q3);


    }


    int currentQuestionIndex = 0;
    int score = 0;



    public void nextQuestion(View v) {

        if (currentQuestionIndex > questions.size() - 1) {
            gotoMain();
            return;
        }

        //2) clear the radio selection
        // rgAnswers.clearCheck();

        q = questions.get(currentQuestionIndex);


        //   Toast.makeText(DetailsActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        //  }
        //isFromCode = true;
        //rgAnswers.clearCheck();
       // isFromCode = false;
        q.dispQuestionWithAnswers(tvQuestion,btn0,btn1,btn2,btn3 );
        currentQuestionIndex++;

    }

    private void gotoMain() {
        //Toast.makeText(DetailsActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("Score", score);
        startActivity(intent);
    }


}
