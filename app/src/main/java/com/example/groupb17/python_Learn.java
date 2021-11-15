package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class python_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
    TextView python_subtopic_1, python_subtopic_2, python_subtopic_3, python_subtopic_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_learn);
        // initiate back_learn_btn ImageButton
        back_learn_btn = findViewById(R.id.back_learn_btn);
        // perform a click event on button
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for back button
                Intent backLearnBtn = new Intent(python_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });
        // initiate python_subtopic_1 TextView
        python_subtopic_1 = findViewById(R.id.python_subtopic_1);
        python_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for python_subtopic_1
                Intent python_subtopic_1 = new Intent(python_Learn.this, python_sub1.class);
                startActivity(python_subtopic_1);
                finish();
            }
        });
        // initiate python_subtopic_2 TextView
        python_subtopic_2 = findViewById(R.id.python_subtopic_2);
        python_subtopic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for python_subtopic_2
                Intent python_subtopic_2 = new Intent(python_Learn.this, python_sub2.class);
                startActivity(python_subtopic_2);
                finish();
            }
        });
        // initiate python_subtopic_3 TextView
        python_subtopic_3 = findViewById(R.id.python_subtopic_3);
        python_subtopic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for python_subtopic_3
                Intent python_subtopic_3 = new Intent(python_Learn.this, python_sub3.class);
                startActivity(python_subtopic_3);
                finish();
            }
        });
        // initiate python_subtopic_4 TextView
        python_subtopic_4 = findViewById(R.id.python_subtopic_4);
        python_subtopic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for python_subtopic_4
                Intent python_subtopic_4 = new Intent(python_Learn.this, python_sub4.class);
                startActivity(python_subtopic_4);
                finish();
            }
        });
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}
