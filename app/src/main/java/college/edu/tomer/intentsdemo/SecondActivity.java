package college.edu.tomer.intentsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/*public class SecondActivity extends AppCompatActivity {

    TextView tvQuestion;
    RadioGroup rgAnswers;
    ArrayList<Question> questions = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvQuestion = (TextView) findViewById(R.id.tvQuestion);
        rgAnswers = (RadioGroup) findViewById(R.id.rgAnswers);

        Intent fIntent = getIntent();
        int songIndex = fIntent.getIntExtra("SongIndex", 1);

       // Toast.makeText(SecondActivity.this, CategoriesList.songs.get(songIndex).getTitle(), Toast.LENGTH_SHORT).show();

        addQuestions();
        nextQuestion(null);
    }

    private void addQuestions() {

        Question q1 = new Question("5! = ?", new String[]{"120", "24", "720", "110"}, 1);

        questions.add(q1);

       Question q2 = new Question("What is the capital of the USA", new String[]{"London", "Chicago", "New York", "Washington"}, 3);

        questions.add(q2);

       Question q3 = new Question("What was the prior last name of shimon peres?", new String[]{"paras", "perszon", "presky", "parsingson"}, 2);

        questions.add(q3);
        Question q4 = new Question("What is the NBA?", new String[]{"Basketball team", "Baseball team", "Football team", "Tennis team"}, 2);

        questions.add(q4);


    }


    int index = 0;

    public void nextQuestion(View view) {
        Toast.makeText(SecondActivity.this, "Clicked", Toast.LENGTH_SHORT).show();


        int checked = rgAnswers.getCheckedRadioButtonId();
        int idx = -1;
        if (checked == R.id.rbAns0) {
            idx = 0;
        } else if (checked == R.id.rbAns1) {
            idx = 1;
        } else if (checked == R.id.rbAns2) {
            idx = 2;
        } else if (checked == R.id.rbAns3) {
            idx = 3;
        } else {
            return; //0) test that there is an answer =>
        }


        //2) clear the radio selection
        rgAnswers.clearCheck();


       Question q = questions.get(index);

        if (q.correctAnswer(idx)) {
            Toast.makeText(SecondActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        }

       // q.dispQuestionWithAnswers(tvQuestion, rgAnswers);
        index++;

        if (index >= questions.size())
            index = 0;

    }





}*/
