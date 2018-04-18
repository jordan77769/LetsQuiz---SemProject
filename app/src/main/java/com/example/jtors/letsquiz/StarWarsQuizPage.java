package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPage  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button StarWarsQuestion1answer1 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer1);
        StarWarsQuestion1answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion1answer2 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer2);
        StarWarsQuestion1answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, QuizPage.class));
            }
        });

        Button StarWarsQuestion1answer3 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer3);
        StarWarsQuestion1answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, StarWarsQuizPageQuestion2.class));
            }
        });

        Button StarWarsQuestion1answer4 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer4);
        StarWarsQuestion1answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, QuizPage.class));
            }
        });
    }
}
