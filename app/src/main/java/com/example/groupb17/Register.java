package com.example.groupb17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    EditText username, password, confirmPass;
    Button buttonSignUp;
    TextView loginText;
    userDB userRegisterDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        // initiate EditText, Button and TextView
        username = (EditText) findViewById(R.id.username_Register);
        password = (EditText) findViewById(R.id.password_Register1);
        confirmPass = (EditText) findViewById(R.id.password_Register2);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        loginText = findViewById(R.id.loginText);
        //initiate Sqlite database from userDB.java
        userRegisterDatabase = new userDB(this);
        //Hides the Action Bar for more screen space
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // perform a click event on SignUp button
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // retrieve the text of username, password and retype password to string value
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String pass2 = confirmPass.getText().toString();
                //If statement for username empty value
                if(user.equals("")){
                    Toast.makeText(Register.this, "Please enter Username", Toast.LENGTH_SHORT).show();
                }//If statement for Password empty value
                else if(pass.equals("")){
                    Toast.makeText(Register.this, "Please enter Password", Toast.LENGTH_SHORT).show();
                }//If statement for Retype Password empty value
                else if(pass2.equals("")){
                    Toast.makeText(Register.this, "Please Re-enter Password", Toast.LENGTH_SHORT).show();
                }//Else statement when all Values are not empty
                else{
                    //If statement when retype password matches with password
                    if(pass.equals(pass2)){
                        //Boolean to check if username already exists in sqlite userData database
                        Boolean checkuser = userRegisterDatabase.usernameVerification(user);
                        //If statement when the Username [does not already] exists in sqlite userData database
                        if(checkuser==false){
                            //Boolean to insert Username and Password value into sqlite userData database
                            Boolean insert = userRegisterDatabase.insertUserData(user, pass);
                            //If statement for when inserting vale into database is successful
                            if(insert==true){
                                //Toast Success and Intent to Login Page after successful validation
                                Toast.makeText(Register.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Login.class);
                                startActivity(intent);
                            }//Else statement when database is not able to insert username and password into sqlite userData database
                            else{
                                Toast.makeText(Register.this, "Error \n \nRegistration failed", Toast.LENGTH_SHORT).show();
                            }
                        }//Else statement when the Username [already] exists in sqlite userData database
                        else{
                            Toast.makeText(Register.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }//Else statement when retype password does not match with password
                    else{
                        Toast.makeText(Register.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        // perform a click event on TextView
        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to Login Page
                Intent R = new Intent(Register.this,Login.class);
                startActivity(R);
                finish();
            }
        });
    }

}