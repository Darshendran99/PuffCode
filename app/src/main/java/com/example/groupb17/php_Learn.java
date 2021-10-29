package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class php_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
    TextView python_subtopic_1, python_subtopic_2, python_subtopic_3, python_subtopic_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_learn);

        back_learn_btn = findViewById(R.id.back_learn_btn);
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLearnBtn = new Intent(php_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });

        python_subtopic_1 = findViewById(R.id.python_subtopic_1);
        python_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent python_subtopic_1 = new Intent(php_Learn.this, php_sub1.class);
                startActivity(python_subtopic_1);
                finish();
            }
        });
        python_subtopic_2 = findViewById(R.id.python_subtopic_2);
        python_subtopic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent python_subtopic_2 = new Intent(php_Learn.this, php_sub2.class);
                startActivity(python_subtopic_2);
                finish();
            }
        });
        python_subtopic_3 = findViewById(R.id.python_subtopic_3);
        python_subtopic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent python_subtopic_3 = new Intent(php_Learn.this, php_sub3.class);
                startActivity(python_subtopic_3);
                finish();
            }
        });
        python_subtopic_4 = findViewById(R.id.python_subtopic_4);
        python_subtopic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent java_subtopic_4 = new Intent(php_Learn.this, php_sub4.class);
                startActivity(java_subtopic_4);
                finish();
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}
