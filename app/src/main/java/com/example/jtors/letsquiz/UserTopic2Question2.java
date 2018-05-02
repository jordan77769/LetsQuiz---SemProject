package com.example.jtors.letsquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class UserTopic2Question2 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic2question2);

        Button UserTopic2Question2Answer1 = (Button)findViewById(R.id.button_UserTopic2Question2Answer1);
        UserTopic2Question2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question2.this, UserTopic2Question2.class));
            }
        });

        Button UserTopic2Question2Answer2 = (Button)findViewById(R.id.button_UserTopic2Question2Answer2);
        UserTopic2Question2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question2.this, UserTopic2Question3.class));
            }
        });

        Button UserTopic2Question2Answer3 = (Button)findViewById(R.id.button_UserTopic2Question2Answer3);
        UserTopic2Question2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question2.this, UserTopic2Question2.class));
            }
        });

        Button UserTopic2Question2Answer4 = (Button)findViewById(R.id.button_UserTopic2Question2Answer4);
        UserTopic2Question2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question2.this, UserTopic2Question2.class));
            }
        });
    }
}
