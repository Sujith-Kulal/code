package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView btn=findViewById(R.id.textViewSignUp);
        btn.setOnClickListener(view -> startActivity(new Intent(loginActivity.this, RegisterActivity.class)));

    }
}