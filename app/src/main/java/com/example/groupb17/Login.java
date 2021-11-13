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
    EditText username, password;
    Button   buttonLogin;
    TextView signUpText;
    userDB userLoginDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_GroupB17);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.username_Login);
        password = (EditText) findViewById(R.id.password_Login);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        signUpText = (TextView) findViewById(R.id.signUpText);
        userLoginDatabase = new userDB(this);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("")){
                    Toast.makeText(Login.this, "Please enter Your Username", Toast.LENGTH_SHORT).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(Login.this, "Please enter Your Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean verifyAccess = userLoginDatabase.usernamePasswordVerification(user, pass);

                    if (verifyAccess == true) {
                        Toast.makeText(Login.this, "Sucessfully Signed In", Toast.LENGTH_SHORT).show();
                        Intent accessGranted = new Intent(Login.this, MainActivity.class);
                        startActivity(accessGranted);
                        finish();
                    }
                    else {
                        Toast.makeText(Login.this, "Wrong Username/Password \n Try Again", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent visitRegister = new Intent(Login.this, Register.class);
                startActivity(visitRegister);
                finish();
            }
        });
    }
}
