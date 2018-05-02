package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic3Question2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic3question2);

        Button UserTopic3Question2Answer1 = (Button)findViewById(R.id.button_UserTopic3Question2Answer1);
        UserTopic3Question2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic3Question2.this, UserTopic3Question2.class));
            }
        });

        Button UserTopic3Question2Answer2 = (Button)findViewById(R.id.button_UserTopic3Question2Answer2);
        UserTopic3Question2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic3Question2.this, UserTopic3Question2.class));
            }
        });

        Button UserTopic3Question2Answer3 = (Button)findViewById(R.id.button_UserTopic3Question2Answer3);
        UserTopic3Question2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic3Question2.this, UserTopic3Question3.class));
            }
        });

        Button UserTopic3Question2Answer4 = (Button)findViewById(R.id.button_UserTopic3Question2Answer4);
        UserTopic3Question2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic3Question2.this, UserTopic3Question2.class));
            }
        });
    }

}
