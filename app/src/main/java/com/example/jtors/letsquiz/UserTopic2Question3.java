package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic2Question3 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic2question3);

        Button UserTopic2Question3Answer1 = (Button)findViewById(R.id.button_UserTopic2Question3Answer1);
        UserTopic2Question3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question3.this, UserCreatedTopics.class));
            }
        });

        Button UserTopic2Question3Answer2 = (Button)findViewById(R.id.button_UserTopic2Question3Answer2);
        UserTopic2Question3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question3.this, UserTopic2Question3.class));
            }
        });

        Button UserTopic2Question3Answer3 = (Button)findViewById(R.id.button_UserTopic2Question3Answer3);
        UserTopic2Question3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question3.this, UserTopic2Question3.class));
            }
        });

        Button UserTopic2Question3Answer4 = (Button)findViewById(R.id.button_UserTopic2Question3Answer4);
        UserTopic2Question3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic2Question3.this, UserTopic2Question3.class));
            }
        });
    }

}
