package com.example.lab05;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.SharedPreferences;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.name);
        final EditText password = (EditText) findViewById(R.id.password);
        final EditText email = (EditText) findViewById(R.id.email);
        Button save = (Button) findViewById(R.id.button);

        SharedPreferences myPreferences = getSharedPreferences("user", MODE_PRIVATE);
        name.setText(myPreferences.getString("name", ""));
        password.setText(myPreferences.getString("password",""));
        email.setText(myPreferences.getString("email",""));

                save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences myPreferences = getApplicationContext().getSharedPreferences("user",MODE_PRIVATE);

                SharedPreferences.Editor edit = myPreferences.edit();

                edit.putString("name" , name.getText().toString());
                edit.putString("password", password.getText().toString());
                edit.putString("email", email.getText().toString());

                edit.apply();

            }

        });


    }



    }



