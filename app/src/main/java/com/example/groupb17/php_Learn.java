package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class php_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
    TextView php_subtopic_1, php_subtopic_2, php_subtopic_3, php_subtopic_4;
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

        php_subtopic_1 = findViewById(R.id.php_subtopic_1);
        php_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent php_subtopic_1 = new Intent(php_Learn.this, php_sub1.class);
                startActivity(php_subtopic_1);
                finish();
            }
        });
        php_subtopic_2 = findViewById(R.id.php_subtopic_2);
        php_subtopic_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent php_subtopic_2 = new Intent(php_Learn.this, php_sub2.class);
                startActivity(php_subtopic_2);
                finish();
            }
        });
        php_subtopic_3 = findViewById(R.id.php_subtopic_3);
        php_subtopic_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent php_subtopic_3 = new Intent(php_Learn.this, php_sub3.class);
                startActivity(php_subtopic_3);
                finish();
            }
        });
        php_subtopic_4 = findViewById(R.id.php_subtopic_4);
        php_subtopic_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent php_subtopic_4 = new Intent(php_Learn.this, php_sub4.class);
                startActivity(php_subtopic_4);
                finish();
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

    }
}
