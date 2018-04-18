package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DCQuizPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button DCanswer1 = (Button)findViewById(R.id.button_DCAnswer1);
        DCanswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, QuizPage.class));
            }
        });

        Button DCanswer2 = (Button)findViewById(R.id.button_DCAnswer2);
        DCanswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, QuizPage.class));
            }
        });

        Button DCanswer3 = (Button)findViewById(R.id.button_DCAnswer3);
        DCanswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, DCQuizPageQuestion2.class));
            }
        });

        Button DCanswer4 = (Button)findViewById(R.id.button_DCAnswer4);
        DCanswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, QuizPage.class));
            }
        });
    }
}
