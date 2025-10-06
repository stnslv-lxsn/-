package com.example.lab10_lisinstanislav_4194;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class ColorsAdapter extends BaseAdapter
{
    private final String[] names;
    private Context context;
    private int resourseId;
    public ColorsAdapter(Context context, int resourseId, String[] names)
    {
        this.context = context;
        this.resourseId = resourseId;
        this.names = names;
    }
    @Override
    public int getCount() { return names.length; }
    @Override
    public Object getItem(int position) { return names[position]; }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        context = parent.getContext();

        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater)
                    context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(resourseId, parent, false);
        }

        TextView textView = (TextView) view;
        textView.setText(names[position]);

        if(position % 2 == 0)
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.red));
        else
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.blue));

        return view;
    }
}
