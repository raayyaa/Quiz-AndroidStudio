package com.example.caemsquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        TextView mFinalScore;
        Button mRecommencez;

            mFinalScore = (TextView)findViewById(R.id.scorefinal);
            mRecommencez = (Button)findViewById(R.id.recommencez);

            Bundle bundle = getIntent().getExtras();
            int score = bundle.getInt("finalScore");

            mFinalScore.setText("Votre score : " + score );

            mRecommencez.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(FinalActivity.this, HomeActivity.class));
                    FinalActivity.this.finish();
                }
            });

        }
    }

