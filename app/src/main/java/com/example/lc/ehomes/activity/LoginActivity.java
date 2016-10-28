package com.example.lc.ehomes.activity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lc.ehomes.R;


public class LoginActivity extends AppCompatActivity {

    String password;
    String count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        Button login_button = (Button) findViewById(R.id.login_button);
        Button register_button = (Button) findViewById(R.id.register_button);
        Button forgetPw = (Button)findViewById(R.id.forgetPw);


        //登录
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText password_edit = (EditText)findViewById(R.id.password_edit);
                EditText count_edit = (EditText)findViewById(R.id.count_edit);
                count = count_edit.getText().toString();
                password = count_edit.getText().toString();
                Boolean IsEnter = false;
                IsEnter = attemptLogin(count , password);

                if (IsEnter){
                    Intent intent_login = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent_login);
                }
            }
        });

        //注册
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_register = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent_register);
            }
        });

        //忘记密码
        forgetPw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_forgetPw = new Intent(LoginActivity.this, ForgetPwActivity.class);
                startActivity(intent_forgetPw);
            }
        });

    }

    private Boolean attemptLogin(String count, String password) {


        if (!IsPhoneNumUtil.isMobileNumber(count)) {

            Toast.makeText(this, "电话号码格式不正确或未填", Toast.LENGTH_SHORT).show();

        }
        else {
            //与数据库的信息匹配：账号 和密码

            if (password.length() == 0){
                Toast.makeText(this, "密码未填", Toast.LENGTH_SHORT).show();
                return false;
            }
            else {
                return true;
            }
            //

        }
        return false;
    }




}
