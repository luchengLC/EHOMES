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
    Button commitBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pw);

        commitBtn = (Button)findViewById(R.id.commit_button);
        count_check_edit = (EditText)findViewById(R.id.count_check_edit);
        id_check_edit = (EditText)findViewById(R.id.Id_check_edit);

        commitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count_check = count_check_edit.getText().toString();
                id_check = id_check_edit.getText().toString();
                if (count_check==null ){
                    Toast.makeText(ForgetPwActivity.this, "账号不能空！", Toast.LENGTH_SHORT).show();
                }
                else if (id_check==null ){
                    Toast.makeText(ForgetPwActivity.this, "身份证号不能空！", Toast.LENGTH_SHORT).show();
                }
                else {


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
