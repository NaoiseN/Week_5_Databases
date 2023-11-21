package com.example.week_5_databases;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Week5_Register extends AppCompatActivity {
    EditText name,password,confirm;
    Button register_new;
    DatabaseHelper db;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week5_register);

        db = new DatabaseHelper(this);
        name = (EditText) findViewById(R.id.ET_register_name);
        password = (EditText) findViewById(R.id.ET_password_register);
        confirm = (EditText) findViewById(R.id.ET_password_confirm);

        register_btn = (Button) findViewById(R.id.register_new);
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name_s = name.getText().toString();
                String password_s = name.getText().toString();
                String confirm_s = name.getText().toString();
            }
        }
    }
}