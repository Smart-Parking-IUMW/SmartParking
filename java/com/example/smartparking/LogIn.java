package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    EditText username, password;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().setTitle("LOG IN");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(login(username.getText().toString(),password.getText().toString())==1){
                Toast.makeText(getApplicationContext(), "Logged In Successful!", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),HomePage.class));

            }else{
                Toast.makeText(getApplicationContext(), "Wrong Username or Password!", Toast.LENGTH_SHORT).show();
            }
        }
    });
}
        public void btn_signup(View view){
            startActivity(new Intent(getApplicationContext(),SignUp.class));
        }

    private int login(String username, String password){
        if(username.isEmpty() || password.isEmpty()){
            return 0;
        }else if(username.equals("abc") && password.equals("abc")){
            return 1;
        }
        return 0;
    }
}
