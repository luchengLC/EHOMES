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

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LoginActivity extends AppCompatActivity {

    String password;
    String count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        EditText password_edit = (EditText)findViewById(R.id.password_edit);
        EditText count_edit = (EditText)findViewById(R.id.count_edit);
        Button login_buton = (Button) findViewById(R.id.login_button);
        Button register_button = (Button) findViewById(R.id.register_button);
        Button forgetPw = (Button)findViewById(R.id.forgetPw);

        count = count_edit.getText().toString();
        password = count_edit.getText().toString();

        //登录
        login_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean IsEnter = false;
                IsEnter = attempLogin(count , password);

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

    private Boolean attempLogin(String count, String password) {
        if (!IsPhoneNumUtil.isMobileNumber(count) || count.length()==0 ) {
            Toast.makeText(this, "电话号码格式不正确", Toast.LENGTH_SHORT).show();
        }
        else if (password.length()==0) {
            Toast.makeText(this, "密码未填写", Toast.LENGTH_SHORT).show();
        }
        else {
            //与数据库的信息匹配：账号 和密码

            return true;
        }
        return false;
    }




}
class IsPhoneNumUtil {
    public static boolean isMobileNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^(0|86|17951)?(13[0-9]|15[0-9]|17[0-9]|18[0-9]|14[0-9])[0-9]{8}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}