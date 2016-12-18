package college.edu.tomer.intentsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent intent = getIntent();

        int score = intent.getIntExtra("Score", 0);
        Toast.makeText(this, score + "", Toast.LENGTH_SHORT).show();
    }


    public void displayScore(View view) {
        Toast.makeText(ScoreActivity.this, "Your Score is ", Toast.LENGTH_SHORT).show();
    }
}
