package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic1 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic1);

        Button UserTopic1Question1Answer1 = (Button)findViewById(R.id.button_UserTopic1Question1Answer1);
        UserTopic1Question1Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic1.this, UserTopic1.class));
            }
        });

        Button UserTopic1Question1Answer2 = (Button)findViewById(R.id.button_UserTopic1Question1Answer2);
        UserTopic1Question1Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic1.this, UserTopic1Question2.class));
            }
        });

        Button UserTopic1Question1Answer3 = (Button)findViewById(R.id.button_UserTopic1Question1Answer3);
        UserTopic1Question1Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic1.this, UserTopic1.class));
            }
        });

        Button UserTopic1Question1Answer4 = (Button)findViewById(R.id.button_UserTopic1Question1Answer4);
        UserTopic1Question1Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic1.this, UserTopic1.class));
            }
        });
    }
}

