package com.example.jtors.letsquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button userAccount = (Button)findViewById(R.id.button_userAccount);
        userAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage.this,UserAccountPage.class));
            }
        });

        Button chooseTopic = (Button)findViewById(R.id.button_chooseTopic);
        chooseTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage.this, ChooseTopic.class));
            }
        });

        Button chooseUserTopic = (Button)findViewById(R.id.button_usercreatedTopics);
        chooseUserTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage.this, UserCreatedTopics.class));
            }
        });


    }
}
