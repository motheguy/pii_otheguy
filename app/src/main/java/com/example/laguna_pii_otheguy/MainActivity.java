package com.example.laguna_pii_otheguy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText lEmailInput;
    private EditText lPasswordInput;
    private Button lConnectionButton;
    private TextView lSignUpLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lEmailInput=findViewById(R.id.login_user_email);
        lPasswordInput=findViewById(R.id.login_input_password);
        lConnectionButton=findViewById(R.id.login_btn);
        lSignUpLink=findViewById(R.id.login_link_sign_up);

    }
}