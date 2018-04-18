package com.example.jtors.letsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button Question1answer1 = (Button)findViewById(R.id.button_Question1Answer1);
        Question1answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizPage.class));
            }
        });

        Button Question1answer2 = (Button)findViewById(R.id.button_Question1Answer2);
        Question1answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizPageQuestion2.class));
            }
        });

        Button Question1answer3 = (Button)findViewById(R.id.button_Question1Answer3);
        Question1answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizPage.class));
            }
        });

        Button Question1answer4 = (Button)findViewById(R.id.button_Question1Answer4);
        Question1answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPage.this, QuizPage.class));
            }
        });
    }
}
