package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Firstnum;
    private EditText secondnum;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firstnum = findViewById(R.id.editTextTextPersonName);

        secondnum = findViewById(R.id.editTextTextPersonName2);
        int fog =Integer.parseInt( Firstnum.getText().toString() + secondnum.getText().toString());
        result.setText("result: " + fog);
    }
}