package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPageQuestion3 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starwarsquizpagequestion3);

        Button StarWarsQuestion3Answer1 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer1);
        StarWarsQuestion3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, StarWarsQuizPageQuestion3.class));
            }
        });

        Button StarWarsQuestion3Answer2 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer2);
        StarWarsQuestion3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, StarWarsQuizPageQuestion3.class));
            }
        });

        Button StarWarsQuestion3Answer3 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer3);
        StarWarsQuestion3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, ChooseTopic.class));
            }
        });

        Button StarWarsQuestion3Answer4 = (Button)findViewById(R.id.button_StarWarsQuestion3Answer4);
        StarWarsQuestion3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion3.this, StarWarsQuizPageQuestion3.class));
            }
        });
    }
}
