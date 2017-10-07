package com.example.suresh.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

import java.util.List;

/**
 * Created by suresh on 7/10/17.
 */

public class CustomGridAdapter extends BaseAdapter{

    private List<GridViewData> listGridViewData;
    private Context context;

    CustomGridAdapter(List<GridViewData> listGridViewData, Context context){
        this.listGridViewData=listGridViewData;
        this.context=context;
    }

    @Override
    public int getCount() {
        return listGridViewData.size();
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
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        convertView=layoutInflater.inflate(R.layout.griditem,null);
        LinearLayout linearLayout=convertView.findViewById(R.id.top_ll);
        linearLayout.setBackgroundColor(Color.parseColor(listGridViewData.get(position).getColorCode()));
        return convertView;
    }
}