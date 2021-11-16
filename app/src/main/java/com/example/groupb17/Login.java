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
    Button buttonLogin;
    TextView signUpText;
    userDB userLoginDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Changes Content to SplashScreen added in themes.xml
        setTheme(R.style.Theme_GroupB17);
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        //Change Content View from Splash screen to Activity Login Page
        setContentView(R.layout.activity_login);
        // initiate EditText, Button and TextView
        username = findViewById(R.id.username_Login);
        password = findViewById(R.id.password_Login);
        buttonLogin = findViewById(R.id.buttonLogin);
        signUpText = findViewById(R.id.signUpText);
        //initiate Sqlite database from userDB.java
        userLoginDatabase = new userDB(this);
        // perform a click event on Login button
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // retrieve the text of username and password to string value
                String userlogin = username.getText().toString();
                String passLogin = password.getText().toString();
                //If statement for username empty value
                if (userlogin.equals("")){
                    Toast.makeText(Login.this, "Error \n \n Please enter Your Username", Toast.LENGTH_SHORT).show();
                }//If statement for Password empty value
                else if(passLogin.equals("")){
                    Toast.makeText(Login.this, "Error \n \n Please enter Your Password", Toast.LENGTH_SHORT).show();
                }//Else statement when both Values are not empty
                else {
                    //Boolean for Username and Password Verification
                    Boolean verifyAccess = userLoginDatabase.usernamePasswordVerification(userlogin, passLogin);
                    //If statement when the Username and Password value exists in sqlite userData database
                    if (verifyAccess == true) {
                        //Toast Success and Intent to Main Activity Page after successful validation
                        Toast.makeText(Login.this, "Successfully Signed In", Toast.LENGTH_SHORT).show();
                        Intent accessGranted = new Intent(Login.this, MainActivity.class);
                        startActivity(accessGranted);
                        finish();
                    }//Else statement when Username and Password value DOES NOT exists in sqlite userData database
                    else {
                        //Toast for Wrong Password Validation
                        Toast.makeText(Login.this, "Wrong Username/Password \n Please Try Again", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        // perform a click event on TextView
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to Register Page
                Intent visitRegister = new Intent(Login.this, Register.class);
                startActivity(visitRegister);
                finish();
            }
        });
    }
}
