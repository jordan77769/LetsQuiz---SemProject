package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic4 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic4);

        Button UserTopic4Question1Answer1 = (Button)findViewById(R.id.button_UserTopic4Question1Answer1);
        UserTopic4Question1Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4.this, UserTopic4.class));
            }
        });

        Button UserTopic4Question1Answer2 = (Button)findViewById(R.id.button_UserTopic4Question1Answer2);
        UserTopic4Question1Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4.this, UserTopic4.class));
            }
        });

        Button UserTopic4Question1Answer3 = (Button)findViewById(R.id.button_UserTopic4Question1Answer3);
        UserTopic4Question1Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4.this, UserTopic4Question2.class));
            }
        });

        Button UserTopic4Question1Answer4 = (Button)findViewById(R.id.button_UserTopic4Question1Answer4);
        UserTopic4Question1Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4.this, UserTopic4.class));
            }
        });
    }
}
