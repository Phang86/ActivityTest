package com.example.activitytest.weixin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.activitytest.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class FruitAdapter extends BaseAdapter {
    Context context;
    List<Entity> fruits;
    private int resourceId;

    public FruitAdapter(Context context,  List<Entity> objects){
        super();
        this.context=context;
        this.fruits=objects;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.shujuxianshi,null);
        CircleImageView fruitimage = convertView.findViewById(R.id.fruit_image);
        TextView fruitName = convertView.findViewById(R.id.fruit_name);
        TextView txt = convertView.findViewById(R.id.fruit_xiaoxi);
        Entity fruit =fruits.get(position);
        fruitimage.setImageResource(fruit.getImageid());
        fruitName.setText(fruit.getName());
        txt.setText(fruit.getXiaoxi());
        return convertView;
    }

}
