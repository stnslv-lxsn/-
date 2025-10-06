package com.example.lab10_lisinstanislav_4194;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class main extends Activity
{
    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.main_act);

        ListView listView = findViewById(R.id.listView);
        String[] items = getResources().getStringArray(R.array.arr);

        ColorsAdapter adapter = new ColorsAdapter(this, R.layout.text1 , items);
        listView.setAdapter(adapter);
    }
}