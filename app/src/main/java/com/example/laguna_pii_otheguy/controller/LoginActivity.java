package com.example.laguna_pii_otheguy.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.laguna_pii_otheguy.R;
import com.example.laguna_pii_otheguy.model.User;

public class LoginActivity extends AppCompatActivity {
    private EditText mEmailInput;
    private EditText mPasswordInput;
    private Button mLogInButton;
    private TextView mSignUpLink;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUser = new User();

        mEmailInput = (EditText) findViewById(R.id.login_user_email);
        mPasswordInput = (EditText) findViewById(R.id.login_input_password);
        mLogInButton=findViewById(R.id.login_btn);
        mSignUpLink = (TextView) findViewById(R.id.login_link_sign_up);

        mLogInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String emailToTest=mEmailInput.getText().toString();
                String passwordToTest=mPasswordInput.getText().toString();
                //test si utilisateur connu, si oui redirection vers la page d'acceuil
                Intent homePageActivityIntent = new Intent(LoginActivity.this,HomePageActivity.class);
                startActivity(homePageActivityIntent);
            }
        });

        mSignUpLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpActivityIntent =new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(signUpActivityIntent);
            }
        });
    }
}