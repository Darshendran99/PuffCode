package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class java_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
    TextView java_subtopic_1, java_subtopic_2, java_subtopic_3, java_subtopic_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_learn);
        // initiate back_learn_btn ImageButton
        back_learn_btn = findViewById(R.id.back_learn_btn);
        // perform a click event on button
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for back button
                Intent backLearnBtn = new Intent(java_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });
        // initiate java_subtopic_1 TextView
        java_subtopic_1 = findViewById(R.id.java_subtopic_1);
        java_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for java_subtopic_1
                Intent java_subtopic_1 = new Intent(java_Learn.this, java_sub1.class);
                startActivity(java_subtopic_1);
                finish();
            }
        });
        // initiate java_subtopic_2 TextView
        java_subtopic_2 = findViewById(R.id.java_subtopic_2);
        java_subtopic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for java_subtopic_2
                Intent java_subtopic_2 = new Intent(java_Learn.this, java_sub2.class);
                startActivity(java_subtopic_2);
                finish();
            }
        });
        // initiate java_subtopic_3 TextView
        java_subtopic_3 = findViewById(R.id.java_subtopic_3);
        java_subtopic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for java_subtopic_3
                Intent java_subtopic_3 = new Intent(java_Learn.this, java_sub3.class);
                startActivity(java_subtopic_3);
                finish();
            }
        });
        // initiate java_subtopic_4 TextView
        java_subtopic_4 = findViewById(R.id.java_subtopic_4);
        java_subtopic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for java_subtopic_4
                Intent java_subtopic_4 = new Intent(java_Learn.this, java_sub4.class);
                startActivity(java_subtopic_4);
                finish();
            }
        });
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}
