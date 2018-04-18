package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class QuizPageQuestion3 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button Question3answer1 = (Button) findViewById(R.id.button_Question3Answer1);
        Question3answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button Question3answer2 = (Button) findViewById(R.id.button_Question3Answer2);
        Question3answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button Question3answer3 = (Button) findViewById(R.id.button_Question3Answer3);
        Question3answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button Question3answer4 = (Button) findViewById(R.id.button_Question3Answer4);
        Question3answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPage.class));
            }
        });
    }
}
