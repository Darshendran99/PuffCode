package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class php_sub4 extends AppCompatActivity {
    ImageButton back_learn_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.php_sub4);
        // initiate back_learn_btn
        back_learn_btn = findViewById(R.id.back_learn_btn);
        // perform a click event on button
        back_learn_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent for back button
                Intent backLearnBtn2 = new Intent(php_sub4.this, php_Learn.class);
                startActivity(backLearnBtn2);
                finish();
            }
        });
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}
