package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic4Question3 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic4question3);

        Button UserTopic4Question3Answer1 = (Button)findViewById(R.id.button_UserTopic4Question3Answer1);
        UserTopic4Question3Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question3.this, UserTopic4Question3.class));
            }
        });

        Button UserTopic4Question3Answer2 = (Button)findViewById(R.id.button_UserTopic4Question3Answer2);
        UserTopic4Question3Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question3.this, UserCreatedTopics.class));
            }
        });

        Button UserTopic4Question3Answer3 = (Button)findViewById(R.id.button_UserTopic4Question3Answer3);
        UserTopic4Question3Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question3.this, UserTopic4Question3.class));
            }
        });

        Button UserTopic4Question3Answer4 = (Button)findViewById(R.id.button_UserTopic4Question3Answer4);
        UserTopic4Question3Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question3.this, UserTopic4Question3.class));
            }
        });
    }
}
