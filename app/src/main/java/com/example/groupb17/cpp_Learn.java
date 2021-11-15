package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cpp_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
    TextView cpp_subtopic_1, cpp_subtopic_2, cpp_subtopic_3, cpp_subtopic_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpp_learn);
        // initiate back_learn_btn ImageButton
        back_learn_btn = findViewById(R.id.back_learn_btn);
        // perform a click event on button
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for back button
                Intent backLearnBtn = new Intent(cpp_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });
        // initiate cpp_subtopic_1 TextView
        cpp_subtopic_1 = findViewById(R.id.cpp_subtopic_1);
        cpp_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for cpp_subtopic_1
                Intent cpp_subtopic_1 = new Intent(cpp_Learn.this, ccp_sub1.class);
                startActivity(cpp_subtopic_1);
                finish();
            }
        });
        // initiate cpp_subtopic_2 TextView
        cpp_subtopic_2 = findViewById(R.id.cpp_subtopic_2);
        cpp_subtopic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for cpp_subtopic_2
                Intent cpp_subtopic_2 = new Intent(cpp_Learn.this, ccp_sub2.class);
                startActivity(cpp_subtopic_2);
                finish();
            }
        });
        // initiate cpp_subtopic_3 TextView
        cpp_subtopic_3 = findViewById(R.id.cpp_subtopic_3);
        cpp_subtopic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for cpp_subtopic_3
                Intent cpp_subtopic_3 = new Intent(cpp_Learn.this, ccp_sub3.class);
                startActivity(cpp_subtopic_3);
                finish();
            }
        });
        // initiate cpp_subtopic_4 TextView
        cpp_subtopic_4 = findViewById(R.id.cpp_subtopic_4);
        cpp_subtopic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for cpp_subtopic_4
                Intent cpp_subtopic_4 = new Intent(cpp_Learn.this, ccp_sub4.class);
                startActivity(cpp_subtopic_4);
                finish();
            }
        });
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}