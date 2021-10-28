package com.example.groupb17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText textInputLayoutFullname,textInputLayoutEmail, textInputLayoutPassword,textInputLayoutPasswordConfirm;
    Button buttonSignUp;
    TextView loginText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textInputLayoutFullname = findViewById(R.id.textInputLayoutFullname);
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);
        textInputLayoutPasswordConfirm = findViewById(R.id.textInputLayoutPasswordConfirm);

        buttonSignUp = findViewById(R.id.buttonSignUp);
        loginText = findViewById(R.id.loginText);


        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FullName, Email, UserName, Password1, Password2;

                FullName = textInputLayoutFullname.getText().toString();
                Email = textInputLayoutEmail.getText().toString();
                Password1 = textInputLayoutPassword.getText().toString();
                Password2 = textInputLayoutPasswordConfirm.getText().toString();

                if (FullName.equals("")) {
                    Toast.makeText(Register.this, "Please Enter Your Full Name", Toast.LENGTH_SHORT).show();
                } else if (Email.equals("")) {
                    Toast.makeText(Register.this, "Please Enter Your Email", Toast.LENGTH_SHORT).show();
                } else if (Password1.equals("")) {
                    Toast.makeText(Register.this, "Please Enter Your Password", Toast.LENGTH_SHORT).show();
                } else if (Password2.equals("")) {
                    Toast.makeText(Register.this, "Please Re-Enter Your Password", Toast.LENGTH_SHORT).show();
                } else if (!Password1.equals(Password2)) {
                    Toast.makeText(Register.this, "The Password Do No Match", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Register.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                    Intent Registered = new Intent(Register.this,Login.class);
                    startActivity(Registered);
                    finish();
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