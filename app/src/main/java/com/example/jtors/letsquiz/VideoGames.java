package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class VideoGames extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videogames);

        Button VideoGamesQuestion1Answer1 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer1);
        VideoGamesQuestion1Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, VideoGames.class));
            }
        });

        Button VideoGamesQuestion1Answer2 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer2);
        VideoGamesQuestion1Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, VideoGamesQuizPageQuestion2.class));
            }
        });

        Button VideoGamesQuestion1Answer3 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer3);
        VideoGamesQuestion1Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, VideoGames.class));
            }
        });

        Button VideoGamesQuestion1Answer4 = (Button)findViewById(R.id.button_VideoGamesQuestion1Answer4);
        VideoGamesQuestion1Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGames.this, VideoGames.class));
            }
        });
    }
}


