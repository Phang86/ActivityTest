package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitytest.weixin.Faxian;
import com.example.activitytest.weixin.Main;
import com.example.activitytest.weixin.Wode;

public class Denglu extends AppCompatActivity implements View.OnClickListener{


    Wode wode;
    Faxian faxian;
    Main main;
    Zhuantailan zhuantailan;
    private Button logBtn,canBtn;
    private EditText userEt,passEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.denglu_layout);

        logBtn = findViewById(R.id.login);
        logBtn.setOnClickListener(this);

        userEt = findViewById(R.id.userEt);
        userEt.setOnClickListener(this);

        passEt = findViewById(R.id.passEt);
        passEt.setOnClickListener(this);

        canBtn = findViewById(R.id.cancel);
        canBtn.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login:
                if (userEt.getText().toString().equals("test") && passEt.getText().toString().equals("123")){
                    String info = userEt.getText().toString();
                    Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.cancel:
                userEt.setText("");
                passEt.setText("");
                break;
        }
    }
}