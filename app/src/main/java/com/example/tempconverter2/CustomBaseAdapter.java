package com.example.tempconverter2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] temp;
    int[] images;

    String[] days;
    LayoutInflater inflater;

    public CustomBaseAdapter() {
    }
    public CustomBaseAdapter(Context ctx,String[] days,String[] temp, int[] images) {
        this.context=ctx;
        this.images=images;
        this.temp=temp;
        this.days=days;
        inflater=LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return temp.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView listTextView=convertView.findViewById(R.id.listTextView);
        TextView listTextView2=convertView.findViewById(R.id.listTextView2);
        ImageView tempImage=convertView.findViewById(R.id.imageIcon);
        listTextView.setText(days[position]);
        listTextView2.setText(temp[position]);
        tempImage.setImageResource(images[position]);
        return convertView;

    }
}
