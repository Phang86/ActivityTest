package com.example.activitytest.weixin;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.activitytest.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main extends Fragment {

    private FruitAdapter adapter;
    private List<Entity> fruitlist = new ArrayList<>();
    Wei_Zhu zhu;
    ListView listView;
    private SwipeRefreshLayout swfl;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listview_main,container,false);
        initFruits();
        swfl = view.findViewById(R.id.xiala_shuxin);
        listView  = view.findViewById(R.id.xinxi);
        adapter = new FruitAdapter(view.getContext(),fruitlist);
        listView.setAdapter(adapter);
        swfl.setColorSchemeResources(R.color.purple_200);
        swfl.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refresh();
            }
        });
        return view;
    }

    public Main(Wei_Zhu zhu) {
        this.zhu = zhu;
    }

    private Entity[] shili = {
            new Entity("小二",R.drawable.me,"大哥来喝酒不？"),
            new Entity("张三",R.drawable.man,"这日子越来越有判头了！"),
            new Entity("李四",R.drawable.manr,"就这？"),
            new Entity("王五",R.drawable.mans,"？"),
            new Entity("赵六",R.drawable.mant,"？？？"),
            new Entity("老八",R.drawable.mans,"你也不行啊！"),
            new Entity("小舅",R.drawable.me,"我就是垃圾!!!"),
            new Entity("春花",R.drawable.mant,"滚吧你！")
    };

    private void initFruits(){
        Random rdm = new Random();
        fruitlist.clear();
        for (int i=0; i<10; i++){
            int index = rdm.nextInt(shili.length);
            fruitlist.add(shili[index]);
        }
    }

    private void refresh(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                zhu.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        initFruits();
                        adapter.notifyDataSetChanged();
                        swfl.setRefreshing(false);
                    }
                });
            }
        }).start();
    }
}
