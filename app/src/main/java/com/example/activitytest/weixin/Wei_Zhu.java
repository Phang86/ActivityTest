package com.example.activitytest.weixin;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;

import com.example.activitytest.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wei_Zhu extends AppCompatActivity implements View.OnClickListener{


    private FruitAdapter adapter;

    private ViewPager viewPager ;
    LinearLayout wei,ton_xun,fa_xian,wode;
    TextView dingbu_Wxtb;

    private ImageButton ibtn;

    private Main main;
    private Txulu suiBian;
    private Faxian faxian;
    private Wode wode1;

    private String titles[]  = {"微信","通讯录","发现","我"};
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wei_zhu);
        init();
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new FragAdapter(getSupportFragmentManager(),fragmentList));
        viewPager.setOffscreenPageLimit(4);
        viewPager.setCurrentItem(0);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                    dingbu_Wxtb.setText(titles[position]);
                    ChangeTextColor(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    //监听点击事件，使文本更换颜色
    private void ChangeTextColor(int position) {
        if(position == 0){
            wei.setBackgroundColor(Color.parseColor("#66CDAB"));
            ton_xun.setBackgroundColor(Color.parseColor("#ffffff"));
            fa_xian.setBackgroundColor(Color.parseColor("#ffffff"));
            wode.setBackgroundColor(Color.parseColor("#ffffff"));
        }else if(position == 1){
            wei.setBackgroundColor(Color.parseColor("#ffffff"));
            ton_xun.setBackgroundColor(Color.parseColor("#66CDAB"));
            fa_xian.setBackgroundColor(Color.parseColor("#ffffff"));
            wode.setBackgroundColor(Color.parseColor("#ffffff"));
        }else if(position == 2){
            wei.setBackgroundColor(Color.parseColor("#ffffff"));
            ton_xun.setBackgroundColor(Color.parseColor("#ffffff"));
            fa_xian.setBackgroundColor(Color.parseColor("#66CDAB"));
            wode.setBackgroundColor(Color.parseColor("#ffffff"));
        }else if(position == 3){
            wei.setBackgroundColor(Color.parseColor("#ffffff"));
            ton_xun.setBackgroundColor(Color.parseColor("#ffffff"));
            fa_xian.setBackgroundColor(Color.parseColor("#ffffff"));
            wode.setBackgroundColor(Color.parseColor("#66CDAB"));
        }
    }


    private void init(){
        //文本监听器
        dingbu_Wxtb = findViewById(R.id.dingbu_weixin);
        dingbu_Wxtb.setOnClickListener(this);

        wei = findViewById(R.id.wei_xin_tubiao);
        wei.setOnClickListener(this);

        ton_xun = findViewById(R.id.tongxun_tubiao);
        ton_xun.setOnClickListener(this);

        fa_xian = findViewById(R.id.faxian_tubiao);
        fa_xian.setOnClickListener(this);

        wode = findViewById(R.id.wo_tubiao);
        wode.setOnClickListener(this);


        //实例化对象并添加到集合里
        main = new Main(this);
        suiBian = new Txulu();
        faxian = new Faxian();
        wode1 = new Wode();

        fragmentList.add(main);
        fragmentList.add(suiBian);
        fragmentList.add(faxian);
        fragmentList.add(wode1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.wei_xin_tubiao:
                viewPager.setCurrentItem(0,true);
                break;
            case R.id.tongxun_tubiao:
                viewPager.setCurrentItem(1,true);
                break;
            case R.id.faxian_tubiao:
                viewPager.setCurrentItem(2,true);
                break;
            case R.id.wo_tubiao:
                viewPager.setCurrentItem(3,true);
                break;
//            case R.id.xiala_tianjia:
//                startActivity(new Intent(Wei_Zhu.this,xiala.class));

//                break;

        }
    }
}
