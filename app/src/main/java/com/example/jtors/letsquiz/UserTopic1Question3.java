package com.example.jtors.letsquiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UserTopic1Question3 extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.usertopic1question3);

            Button UserTopic1Question3Answer1 = (Button)findViewById(R.id.button_UserTopic1Question3Answer1);
            UserTopic1Question3Answer1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(UserTopic1Question3.this, UserCreatedTopics.class));
                }
            });

            Button UserTopic1Question3Answer2 = (Button)findViewById(R.id.button_UserTopic1Question3Answer2);
            UserTopic1Question3Answer2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(UserTopic1Question3.this, UserTopic1Question3.class));
                }
            });

            Button UserTopic1Question3Answer3 = (Button)findViewById(R.id.button_UserTopic1Question3Answer3);
            UserTopic1Question3Answer3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(UserTopic1Question3.this, UserTopic1Question3.class));
                }
            });

            Button UserTopic1Question3Answer4 = (Button)findViewById(R.id.button_UserTopic1Question3Answer4);
            UserTopic1Question3Answer4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(UserTopic1Question3.this, UserTopic1Question3.class));
                }
            });
        }
}
