package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ccp_sub2 extends AppCompatActivity {
    ImageButton back_learn_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ccp_sub2);
        back_learn_btn = findViewById(R.id.back_learn_btn);
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backLearnBtn = new Intent(ccp_sub2.this, cpp_Learn.class);
                startActivity(backLearnBtn);
                finish();
            }
        });
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}