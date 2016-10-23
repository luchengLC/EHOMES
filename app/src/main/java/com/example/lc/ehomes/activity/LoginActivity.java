package com.example.lc.ehomes.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lc.ehomes.R;


public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        EditText password_edit = (EditText)findViewById(R.id.password_edit);
        EditText count_edit = (EditText)findViewById(R.id.count_edit);
        Button login_buton = (Button) findViewById(R.id.login_button);
        Button register_button = (Button) findViewById(R.id.register_button);

        login_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "正在输入", Toast.LENGTH_SHORT).show();
            }
        });


    }



}
