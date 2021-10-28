package com.example.groupb17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cpp_Learn extends AppCompatActivity {
    ImageButton back_learn_btn;
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

    }
}