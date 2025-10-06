package com.example.lab11_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.Map;
import java.util.Set;

public class changeColor extends Activity {

    private SharedPreferences sharedPreferences;
    private int[] values;
    private int selectedPosition = 4;
    public static int savedColor;

    @Override
    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.changecolor_act);

        ListView listView = findViewById(R.id.listView);

        String[] names = getResources().getStringArray(R.array.colors);
        values = getResources().getIntArray(R.array.check_c);

        listView.setAdapter(new ColorsAdapter(this, R.layout.textv, names, values));

        listView.setOnItemClickListener((parent, view, position, id) ->
            {
                selectedPosition = position;
                getWindow().getDecorView().setBackgroundColor(values[selectedPosition]);
            });

        sharedPreferences = getSharedPreferences(getString(R.string.select_color), MODE_PRIVATE);
    }
    public void closeActivity(View view) { startActivity(new Intent(this, main.class)); }
    @Override
    protected void onResume()
    {
        super.onResume();
        savedColor = sharedPreferences.getInt("selected_color", values[selectedPosition]);
        getWindow().getDecorView().setBackgroundColor(savedColor);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("selected_color", values[selectedPosition]);
        editor.apply();
    }
}