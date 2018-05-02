package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class QuizPageQuestion2 extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizpagequestion2);

        Button Question2Answer1 = (Button)findViewById(R.id.button_Question2Answer1);
        Question2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion2.this, QuizPageQuestion2.class));
            }
        });

        Button Question2Answer2 = (Button)findViewById(R.id.button_Question2Answer2);
        Question2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion2.this, QuizPageQuestion2.class));
            }
        });

        Button Question2Answer3 = (Button)findViewById(R.id.button_Question2Answer3);
        Question2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion2.this, QuizPageQuestion3.class));
            }
        });

        Button Question2Answer4 = (Button)findViewById(R.id.button_Question2Answer4);
        Question2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizPageQuestion2.this, QuizPageQuestion2.class));
            }
        });
    }
}
