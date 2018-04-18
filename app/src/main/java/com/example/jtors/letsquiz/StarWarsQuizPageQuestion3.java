package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPageQuestion3 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button StarWarsQuestion3answer1 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer1);
        StarWarsQuestion3answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion3answer2 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer2);
        StarWarsQuestion3answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion3answer3 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer3);
        StarWarsQuestion3answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion3answer4 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer4);
        StarWarsQuestion3answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, QuizPage.class));
            }
        });
    }
}
