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

        back_learn_btn = findViewById(R.id.back_learn_btn);
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLearnBtn = new Intent(cpp_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });

        cpp_subtopic_1 = findViewById(R.id.cpp_subtopic_1);
        cpp_subtopic_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cpp_subtopic_1 = new Intent(cpp_Learn.this, ccp_sub1.class);
                startActivity(cpp_subtopic_1);
                finish();
            }
        });

    }
}