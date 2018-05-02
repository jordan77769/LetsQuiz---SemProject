package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StarWarsQuizPageQuestion2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starwarsquizpagequestion2);

        Button StarWarsQuestion2Answer1 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer1);
        StarWarsQuestion2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, StarWarsQuizPageQuestion3.class));
            }
        });

        Button StarWarsQuestion2Answer2 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer2);
        StarWarsQuestion2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(StarWarsQuizPageQuestion2.this, StarWarsQuizPageQuestion2.class));
            }
        });

        Button StarWarsQuestion2Answer3 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer3);
        StarWarsQuestion2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, StarWarsQuizPageQuestion2.class));
            }
        });

        Button StarWarsQuestion2Answer4 = (Button)findViewById(R.id.button_StarWarsQuestion2Answer4);
        StarWarsQuestion2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(StarWarsQuizPageQuestion2.this, StarWarsQuizPageQuestion2.class));
            }
        });
    }
}
