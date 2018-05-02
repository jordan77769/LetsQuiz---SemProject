package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPage  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starwarsquizpage);

        Button StarWarsQuestion1Answer1 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer1);
        StarWarsQuestion1Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, StarWarsQuizPage.class));
            }
        });

        Button StarWarsQuestion1Answer2 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer2);
        StarWarsQuestion1Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, StarWarsQuizPage.class));
            }
        });

        Button StarWarsQuestion1Answer3 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer3);
        StarWarsQuestion1Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, StarWarsQuizPageQuestion2.class));
            }
        });

        Button StarWarsQuestion1Answer4 = (Button)findViewById(R.id.button_StarWarsQuestion1Answer4);
        StarWarsQuestion1Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPage.this, StarWarsQuizPage.class));
            }
        });
    }
}
