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

        Button topic1 = (Button)findViewById(R.id.button_Topic1);
        topic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, QuizPage.class));
            }
        });

        Button topic2 = (Button)findViewById(R.id.button_Topic2);
        topic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, DCQuizPage.class));
            }
        });

        Button topic3 = (Button)findViewById(R.id.button_Topic3);
        topic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, StarWarsQuizPage.class));
            }
        });

        Button topic4 = (Button)findViewById(R.id.button_Topic4);
        topic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseTopic.this, VideoGames.class));
            }
        });
    }
}
