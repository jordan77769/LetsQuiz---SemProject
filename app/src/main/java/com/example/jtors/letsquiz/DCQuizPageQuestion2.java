package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class DCQuizPageQuestion2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button DCQuestion2Answer1 = (Button)findViewById(R.id.button_DCQuestion2Answer1);
        DCQuestion2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button DCQuestion2Answer2 = (Button)findViewById(R.id.button_DCQuestion2Answer2);
        DCQuestion2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button DCQuestion2Answer3 = (Button)findViewById(R.id.button_DCQuestion2Answer3);
        DCQuestion2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button DCQuestion2Answer4 = (Button)findViewById(R.id.button_DCQuestion2Answer4);
        DCQuestion2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion2.this, DCQuizPageQuestion3.class));
            }
        });
    }
}
