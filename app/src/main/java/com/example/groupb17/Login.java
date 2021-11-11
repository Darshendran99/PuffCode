package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText textInputLayoutUsername,textInputLayoutPassword;
    Button buttonLogin;
    TextView signUpText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_GroupB17);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_login);

        textInputLayoutUsername = findViewById(R.id.textInputLayoutUsername);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);

        buttonLogin = findViewById(R.id.buttonLogin);
        signUpText = findViewById(R.id.signUpText);

        buttonLogin.setOnClickListener(view -> {
            String username,pass_word;

            username = textInputLayoutUsername.getText().toString();
            pass_word = textInputLayoutPassword.getText().toString();

            if(username.equals("")){
                Toast.makeText(Login.this, "Please Enter Your Username", Toast.LENGTH_SHORT).show();
            }
            else if(pass_word.equals("")){
                Toast.makeText(Login.this, "Please Enter Your Password",Toast.LENGTH_SHORT).show();
            }
            else{
                Intent loginSuccess = new Intent(Login.this, MainActivity.class);
                startActivity(loginSuccess);
                finish();

            }
        });
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visitRegister = new Intent(Login.this,Register.class);
                startActivity(visitRegister);
                finish();
            }
        });


    }
}