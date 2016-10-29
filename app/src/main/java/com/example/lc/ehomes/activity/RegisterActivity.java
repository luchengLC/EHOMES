package com.example.lc.ehomes.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.example.lc.ehomes.R;


public class RegisterActivity extends AppCompatActivity {
    EditText count_edit, password_edit,id_edit;
    RadioGroup genderRG;
    Button getIdentifyingCodeBtn, commit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        count_edit = (EditText)findViewById(R.id.count_edit);
        password_edit = (EditText)findViewById(R.id.password_edit);
        id_edit = (EditText)findViewById(R.id.idNum_edit);
        genderRG = (RadioGroup)findViewById(R.id.gender_rg);

        getIdentifyingCodeBtn = (Button)findViewById(R.id.getIdentifyingCodeBtn);
        getIdentifyingCodeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
