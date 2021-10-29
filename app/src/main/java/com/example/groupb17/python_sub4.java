package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class python_sub4 extends AppCompatActivity {
    ImageButton back_learn_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.python_sub4);

        back_learn_btn = findViewById(R.id.back_learn_btn);
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLearnBtn2 = new Intent(python_sub4.this, python_Learn.class);
                startActivity(backLearnBtn2);
                finish();
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}