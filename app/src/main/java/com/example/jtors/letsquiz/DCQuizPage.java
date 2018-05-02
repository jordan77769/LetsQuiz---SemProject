package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DCQuizPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcquizpage);

        Button DCAnswer1 = (Button)findViewById(R.id.button_DCAnswer1);
        DCAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, DCQuizPage.class));
            }
        });

        Button DCAnswer2 = (Button)findViewById(R.id.button_DCAnswer2);
        DCAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, DCQuizPage.class));
            }
        });

        Button DCAnswer3 = (Button)findViewById(R.id.button_DCAnswer3);
        DCAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, DCQuizPageQuestion2.class));
            }
        });

        Button DCAnswer4 = (Button)findViewById(R.id.button_DCAnswer4);
        DCAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPage.this, DCQuizPage.class));
            }
        });
    }
}
