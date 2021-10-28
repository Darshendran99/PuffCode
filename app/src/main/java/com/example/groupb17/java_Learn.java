package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class java_Learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton back_learn_btn;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_learn);

        back_learn_btn = findViewById(R.id.back_learn_btn);
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLearnBtn = new Intent(java_Learn.this, MainActivity.class);
                startActivity(backLearnBtn);
                finish();
            }
        });

    }
}