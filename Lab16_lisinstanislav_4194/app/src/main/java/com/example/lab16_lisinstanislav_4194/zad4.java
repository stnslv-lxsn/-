package com.example.lab16_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class zad4 extends Activity {


    TextView textView1, textView2;

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.zad4_act);

        textView1 = findViewById(R.id.text1);
        textView1.setTextColor(getColor(R.color.purple_200));
        textView1.setBackgroundColor(getColor(R.color.teal_700));

        textView2 = findViewById(R.id.text2);
        textView2.setTextColor(getColor(R.color.purple_500));
        textView2.setBackgroundColor(getColor(R.color.teal_200));
    }
    public void onClick(View view)
    {
        LayoutInflater inflater = getLayoutInflater();
        view = inflater.inflate(R.layout.zad4_act,
                (ViewGroup) findViewById(R.id.zad4_act));
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
    public void back(View view) { startActivity(new Intent(this, main.class));}
}
