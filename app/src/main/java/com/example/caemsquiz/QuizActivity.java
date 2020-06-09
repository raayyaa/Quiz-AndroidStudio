package com.example.caemsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private AllQuestions mAllQuestions = new AllQuestions();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;


    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);

        updateQuestion();

        //Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //verifie si c'est la derniere question
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "correcte", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "faux", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //fin Button 1

        //Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //verifie si c'est la derniere question
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "correcte", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "faux", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //fin Button 2

        //Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //verifie si c'est la derniere question
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "correcte", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "faux", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //fin Button 3

        //Button 4
        mButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice4.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);

                    //verifie si c'est la derniere question
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "correcte", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if (mQuestionNumber == AllQuestions.mQuestions.length) {
                        Intent i = new Intent(QuizActivity.this, FinalActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", mScore);
                        i.putExtras(bundle);
                        QuizActivity.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                        Toast.makeText(QuizActivity.this, "faux", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        //fin Button4
    }

    private void updateQuestion(){
        mQuestionView.setText(mAllQuestions.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mAllQuestions.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mAllQuestions.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mAllQuestions.getChoice3(mQuestionNumber));
        mButtonChoice4.setText(mAllQuestions.getChoice4(mQuestionNumber));

        mAnswer = mAllQuestions.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
