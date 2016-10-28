package com.example.lc.ehomes.activity;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lc.ehomes.R;

public class ForgetPwActivity extends AppCompatActivity {
    String count_check;
    String id_check;
    EditText count_check_edit;
    EditText id_check_edit;
    Button findBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pw);

        findBack = (Button)findViewById(R.id.findBack);
        count_check_edit = (EditText)findViewById(R.id.count_check_edit);
        id_check_edit = (EditText)findViewById(R.id.Id_check_edit);

        findBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean countExist = false;

                count_check = count_check_edit.getText().toString();
                id_check = id_check_edit.getText().toString();

                if (!IsPhoneNumUtil.isMobileNumber(count_check) ||count_check.length() == 0 ){
                    Toast.makeText(ForgetPwActivity.this, "账号未填 或电话号码不正确！", Toast.LENGTH_SHORT).show();
                }
                else if (id_check.length()==0 ){
                    Toast.makeText(ForgetPwActivity.this, "身份证号不能空！", Toast.LENGTH_SHORT).show();
                }
                else {
                    //test Toast
                    Toast.makeText(ForgetPwActivity.this, "Test：findBack 按钮可以正常运行", Toast.LENGTH_SHORT).show();
                    countExist = findBackPw(count_check,id_check);
                }
            }
        });
    }


    private Boolean findBackPw(String count,String id){
        Boolean countExist = false;
        //进度条：正在通信
        //接口：与服务器连接，查找数据库数据匹配，找回密码
        if (true){//条件：待改
            countExist = true;
            AlertDialog.Builder builder = new AlertDialog.Builder(this)
                    .setTitle("您的密码是")
                    .setMessage("");//待填

        }
        return countExist;
    }
}
