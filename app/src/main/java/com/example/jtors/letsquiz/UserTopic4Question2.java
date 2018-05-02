package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic4Question2 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usertopic4question2);

        Button UserTopic4Question2Answer1 = (Button)findViewById(R.id.button_UserTopic4Question2Answer1);
        UserTopic4Question2Answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question2.this, UserTopic4Question2.class));
            }
        });

        Button UserTopic4Question2Answer2 = (Button)findViewById(R.id.button_UserTopic4Question2Answer2);
        UserTopic4Question2Answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question2.this, UserTopic4Question3.class));
            }
        });

        Button UserTopic4Question2Answer3 = (Button)findViewById(R.id.button_UserTopic4Question2Answer3);
        UserTopic4Question2Answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question2.this, UserTopic4Question2.class));
            }
        });

        Button UserTopic4Question2Answer4 = (Button)findViewById(R.id.button_UserTopic4Question2Answer4);
        UserTopic4Question2Answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserTopic4Question2.this, UserTopic4Question2.class));
            }
        });
    }

}
