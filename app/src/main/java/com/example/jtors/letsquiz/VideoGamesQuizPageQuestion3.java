package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class VideoGamesQuizPageQuestion3 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videogamesquizpagequestion3);

        Button VideoGamesQuestion3Answer1 = (Button)findViewById(R.id.button_VideoGamesQuestion3Answer1);
        VideoGamesQuestion3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion3.this, VideoGamesQuizPageQuestion3.class));
            }
        });

        Button VideoGamesQuestion3Answer2 = (Button)findViewById(R.id.button_VideoGamesQuestion3Answer2);
        VideoGamesQuestion3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion3.this, ChooseTopic.class));
            }
        });

        Button VideoGamesQuestion3Answer3 = (Button)findViewById(R.id.button_VideoGamesQuestion3Answer3);
        VideoGamesQuestion3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion3.this, VideoGamesQuizPageQuestion3.class));
            }
        });

        Button VideoGamesQuestion3Answer4 = (Button)findViewById(R.id.button_VideoGamesQuestion3Answer4);
        VideoGamesQuestion3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion3.this, VideoGamesQuizPageQuestion3.class));
            }
        });
    }
}
