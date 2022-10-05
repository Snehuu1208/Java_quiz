package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View v) {
        Toast.makeText(this, "Opening activity ", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}