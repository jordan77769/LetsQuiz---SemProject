package com.example.jtors.letsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserCreatedTopics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_created_topics);

        Button userTopic1 = (Button)findViewById(R.id.button_UserTopic1);
        userTopic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserCreatedTopics.this, QuizPage.class));
            }
        });

        Button userTopic2 = (Button)findViewById(R.id.button_UserTopic2);
        userTopic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserCreatedTopics.this, QuizPage.class));
            }
        });

        Button userTopic3 = (Button)findViewById(R.id.button_UserTopic3);
        userTopic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserCreatedTopics.this, QuizPage.class));
            }
        });

        Button userTopic4 = (Button)findViewById(R.id.button_UserTopic4);
        userTopic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserCreatedTopics.this, QuizPage.class));
            }
        });
    }
}
