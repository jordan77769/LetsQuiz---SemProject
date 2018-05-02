package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DCQuizPageQuestion3 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dcquizpagequestion3);

        Button DCQuestion3Answer1 = (Button)findViewById(R.id.button_DCQuestion3Answer1);
        DCQuestion3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion3.this, DCQuizPageQuestion3.class));
            }
        });

        Button DCQuestion3Answer2 = (Button)findViewById(R.id.button_DCQuestion3Answer2);
        DCQuestion3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion3.this, DCQuizPageQuestion3.class));
            }
        });

        Button DCQuestion3Answer3 = (Button)findViewById(R.id.button_DCQuestion3Answer3);
        DCQuestion3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion3.this, ChooseTopic.class));
            }
        });

        Button DCQuestion3Answer4 = (Button)findViewById(R.id.button_DCQuestion3Answer4);
        DCQuestion3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DCQuizPageQuestion3.this, DCQuizPageQuestion3.class));
            }
        });
    }
}
