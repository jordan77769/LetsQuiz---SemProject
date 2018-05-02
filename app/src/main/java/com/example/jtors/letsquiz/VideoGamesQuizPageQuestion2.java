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
        setContentView(R.layout.videogamesquizpagequestion2);

        Button VideoGamesQuestion2Answer1 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer1);
        VideoGamesQuestion2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, VideoGamesQuizPageQuestion2.class));
            }
        });

        Button VideoGamesQuestion2Answer2 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer2);
        VideoGamesQuestion2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, VideoGamesQuizPageQuestion2.class));
            }
        });

        Button VideoGamesQuestion2Answer3 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer3);
        VideoGamesQuestion2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, VideoGamesQuizPageQuestion2.class));
            }
        });

        Button VideoGamesQuestion2Answer4 = (Button)findViewById(R.id.button_VideoGamesQuestion2Answer4);
        VideoGamesQuestion2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(VideoGamesQuizPageQuestion2.this, VideoGamesQuizPageQuestion3.class));
            }
        });
    }

}
