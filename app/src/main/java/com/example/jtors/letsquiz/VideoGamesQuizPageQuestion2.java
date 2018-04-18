package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jtors on 4/17/2018.
 */

public class VideoGamesQuizPageQuestion2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        Button VideoGamesQuestion2answer1 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer1);
        VideoGamesQuestion2answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion2answer2 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer2);
        VideoGamesQuestion2answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion2answer3 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer3);
        VideoGamesQuestion2answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, QuizPage.class));
            }
        });

        Button VideoGamesQuestion2answer4 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer4);
        VideoGamesQuestion2answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, QuizPage.class));
            }
        });
    }

}
