package com.example.jtors.letsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseTopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topic);

        Button Topic1 = (Button)findViewById(R.id.button_Topic1);
        Topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, QuizPage.class));
            }
        });

        Button Topic2 = (Button)findViewById(R.id.button_Topic2);
        Topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, DCQuizPage.class));
            }
        });

        Button Topic3 = (Button)findViewById(R.id.button_Topic3);
        Topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, StarWarsQuizPage.class));
            }
        });

        Button Topic4 = (Button)findViewById(R.id.button_Topic4);
        Topic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, VideoGames.class));
            }
        });

        Button goBack = (Button)findViewById(R.id.button_GoBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, MainPage.class));
            }
        });
    }
}
