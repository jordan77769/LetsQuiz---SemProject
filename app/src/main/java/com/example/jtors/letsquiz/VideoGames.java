package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jtors on 4/17/2018.
 */

public class VideoGames extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button VideoGamesQuestion1answer1 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer1);
        VideoGamesQuestion1answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion1answer2 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer2);
        VideoGamesQuestion1answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion1answer3 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer3);
        VideoGamesQuestion1answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion1answer4 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer4);
        VideoGamesQuestion1answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, QuizPage.class));
            }
        });
    }
}


