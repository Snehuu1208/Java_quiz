package com.example.javaquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private String[] questions={"Q1.  Java was Developed in 1995?","Q2.  Java was created using python?",
    "Q3.  Java has abstract classes?","Q4.  Java supports interface","Q5.  Java is a person"};
    private boolean[] answers={true,false,true,true,false};
    private int score=0;
    Button yes;
    Button no;
    TextView question;


    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        yes =findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length-1){
                    if(answers[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1) {
                        question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length-1){
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1) {
                     question.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity2.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}