package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button button;
    EditText username,password,email,confirm_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("SIGN UP");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        confirm_password = (EditText) findViewById(R.id.confirm_password);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signup(username.getText().toString(),password.getText().toString(),email.getText().toString(),confirm_password.getText().toString())==1){
                    Toast.makeText(getApplicationContext(), "Sign Up Successful!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(getApplicationContext(),LogIn.class));

                }else{
                    Toast.makeText(getApplicationContext(), "Error !", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private int signup(String username, String password, String email,String confirm_password){
        if(username.isEmpty() || password.isEmpty() || email.isEmpty() || confirm_password.isEmpty()){
            return 0;
        }return 1;
    }
    //public void btn_signup(View view){
        //startActivity(new Intent(getApplicationContext(),LogIn.class));
        //Toast.makeText(getApplicationContext(), "Sign Up Successful!", Toast.LENGTH_SHORT).show();
   // }

}
