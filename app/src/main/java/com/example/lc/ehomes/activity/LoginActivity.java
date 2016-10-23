package com.example.lc.ehomes.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lc.ehomes.R;

import butterknife.BindView;

public class LoginActivity extends AppCompatActivity {
    Boolean flag_MsgTrue = false;

    @BindView(R.id.login_button)
    Button login_button;
    @BindView(R.id.register_button)
    Button register_button;
    @BindView(R.id.count_edit)
    EditText count_edit;
    @BindView(R.id.password_edit)
    EditText password_edit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




    }


}
