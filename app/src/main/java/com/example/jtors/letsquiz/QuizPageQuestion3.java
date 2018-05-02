package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class QuizPageQuestion3 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizpagequestion3);

        Button Question3Answer1 = (Button) findViewById(R.id.button_Question3Answer1);
        Question3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPageQuestion3.class));
            }
        });

        Button Question3Answer2 = (Button) findViewById(R.id.button_Question3Answer2);
        Question3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPageQuestion3.class));
            }
        });

        Button Question3Answer3 = (Button) findViewById(R.id.button_Question3Answer3);
        Question3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, ChooseTopic.class));
            }
        });

        Button Question3Answer4 = (Button) findViewById(R.id.button_Question3Answer4);
        Question3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion3.this, QuizPageQuestion3.class));
            }
        });
    }
}
