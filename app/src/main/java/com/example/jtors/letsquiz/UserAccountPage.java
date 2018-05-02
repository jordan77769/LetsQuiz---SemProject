package com.example.jtors.letsquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class UserAccountPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account_page);

        Button goBack = (Button)findViewById(R.id.button_GoBack);
        goBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserAccountPage.this, MainPage.class));
            }
        });

        Button viewQuizzes = (Button)findViewById(R.id.button_viewQuizzes);
        viewQuizzes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserAccountPage.this, UserCreatedTopics.class));
            }
        });

        Button changeUsername = (Button)findViewById(R.id.button_changeUser);
        changeUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserAccountPage.this, ChangeUsername.class));
            }
        });

        Button changePassword = (Button)findViewById(R.id.button_changePassword);
        changePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(UserAccountPage.this, ChangePassword.class));
            }
        });


        String filename = "myfile";
        String fileContents = "Hello user!";
        FileOutputStream outputStream;

        try {
           outputStream = openFileOutput(filename, Context.MODE_PRIVATE);
            outputStream.write(fileContents.getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        FileInputStream inputStream;
        String result = "";
        try {
            inputStream = openFileInput(filename);
            result = "";
            int element = 0;
            while((element = inputStream.read()) != -1 )
            {
                result += (char)element;
            }
            inputStream.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        Toast.makeText(this, result,Toast.LENGTH_SHORT).show();

        //Get Directory
        File directory = this.getFilesDir();
        File[] list = directory.listFiles();
        for(int i=0; i<list.length;i++)
        {
            File getFile = list[i];
            Log.i("INFO", getFile.getAbsolutePath());
        }
    }
}
