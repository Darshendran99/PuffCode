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

        username = (EditText) findViewById(R.id.username_Register);
        password = (EditText) findViewById(R.id.password_Register1);
        confirmPass = (EditText) findViewById(R.id.password_Register2);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        loginText = findViewById(R.id.loginText);
        userRegisterDatabase = new userDB(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String pass2 = confirmPass.getText().toString();

                if(user.equals("")){
                    Toast.makeText(Register.this, "Please enter Username", Toast.LENGTH_SHORT).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(Register.this, "Please enter Password", Toast.LENGTH_SHORT).show();
                }
                else if(pass2.equals("")){
                    Toast.makeText(Register.this, "Please Re-enter Password", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(pass2)){
                        Boolean checkuser = userRegisterDatabase.usernameVerification(user);

                        if(checkuser==false){
                            Boolean insert = userRegisterDatabase.insertUserData(user, pass);

                            if(insert==true){
                                Toast.makeText(Register.this, "Registered successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Login.class);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(Register.this, "Registration failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Register.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(Register.this, "Passwords not matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent R = new Intent(Register.this,Login.class);
                startActivity(R);
                finish();
            }
        });
    }

}