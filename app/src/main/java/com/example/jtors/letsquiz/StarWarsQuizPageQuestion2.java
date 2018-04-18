package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPageQuestion2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button StarWarsQuestion2answer1 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer1);
        StarWarsQuestion2answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, StarWarsQuizPageQuestion3.class));
            }
        });

        Button StarWarsQuestion2answer2 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer2);
        StarWarsQuestion2answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(StarWarsQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion2answer3 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer3);
        StarWarsQuestion2answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion2answer4 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer4);
        StarWarsQuestion2answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, QuizPage.class));
            }
        });
    }
}
