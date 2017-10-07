package com.example.suresh.app;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        final GridView gridview= (GridView) findViewById(R.id.gridview);
        final List<GridViewData> gridViewDataList=new ArrayList<>();
        for(int i=0;i<9;i++){
            if(i%2==0)
                gridViewDataList.add(new GridViewData("#76032a"));
            else
                gridViewDataList.add(new GridViewData("#303F9F"));
        }
        final CustomGridAdapter customGridAdapter=new CustomGridAdapter(gridViewDataList,GridViewActivity.this);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String colorCode=gridViewDataList.get(position).getColorCode();
                if(colorCode.equals("#76032a")){
                    gridViewDataList.get(position).setColorCode("#303F9F");
                }else{
                    gridViewDataList.get(position).setColorCode("#76032a");
                }
                customGridAdapter.notifyDataSetChanged();
            }
        });
        gridview.setAdapter(customGridAdapter);
    }
}