package com.example.activitytest.weixin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.activitytest.R;

public class xiala extends Activity implements View.OnClickListener{


    private ImageButton imageButton;

    private LinearLayout faqi_quliao,add_pengyou,saoyi_sao,shoufu_kuang,bangzu_fankui;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xiala);
    }

    private void init(){
        faqi_quliao = findViewById(R.id.faqiliaotian);
        faqi_quliao.setOnClickListener(this);

        add_pengyou = findViewById(R.id.addhaoyou);
        add_pengyou.setOnClickListener(this);

        saoyi_sao = findViewById(R.id.saoma);
        saoyi_sao.setOnClickListener(this);

        shoufu_kuang = findViewById(R.id.shoufukuang);
        shoufu_kuang.setOnClickListener(this);

        bangzu_fankui = findViewById(R.id.bangzufankui);
        bangzu_fankui.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
        }
    }
}