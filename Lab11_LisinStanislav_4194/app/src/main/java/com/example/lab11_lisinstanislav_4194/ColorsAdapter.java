package com.example.lab11_lisinstanislav_4194;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorsAdapter extends BaseAdapter {
    private Context context;
    private String[] arr;
    private int[] colors;
    private int resourceId;
    public ColorsAdapter(Context context, int resourceId, String[] names, int[] values)
    {
        this.context = context;
        this.resourceId = resourceId;
        arr = names;
        colors = values;
    }
    @Override
    public int getCount() { return arr.length; }
    @Override
    public Object getItem(int position) { return colors[position]; }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)  {
        context = parent.getContext();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(resourceId, parent, false);
        }

        TextView textView = (TextView) view;
        textView.setText(arr[position]);
        textView.setBackgroundColor(colors[position]);

        return view;
    }

}
