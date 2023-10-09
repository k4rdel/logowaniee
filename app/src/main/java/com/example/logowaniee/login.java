package com.example.logowaniee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView textViewLogin = findViewById(R.id.textViewLogin);

        String login = getIntent().getStringExtra("login");
        textViewLogin.setText("Login: " + login);
    }
}