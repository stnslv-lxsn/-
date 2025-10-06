package com.rocot.lab3_lisinstanislav_419_4;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class Main extends Activity {

    TextView textView1, textView2;
    Button button1, button2, button3, button4, button5, button6;
    LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        linearLayout = (LinearLayout) findViewById(R.id.MainLayout);

        textView1 = (TextView) findViewById(R.id.Text1);
        textView2 = (TextView) findViewById(R.id.Text2);

        button1 = (Button) findViewById(R.id.GreenRed);
        button2 = (Button) findViewById(R.id.BlackWhite);
        button3 = (Button) findViewById(R.id.PurpleGray);

        button4 = (Button) findViewById(R.id.Blue);
        button5 = (Button) findViewById(R.id.Red);
        button6 = (Button) findViewById(R.id.Pink);
    }

    public void Set_button1(View view)
    {
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        textView1.setTextColor(ContextCompat.getColor(this, R.color.red));
        textView2.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.green));
    }
    public void Set_button2(View view)
    {
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.black));
        textView1.setTextColor(ContextCompat.getColor(this, R.color.white));
        textView2.setBackgroundColor(ContextCompat.getColor(this, R.color.white));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.black));
    }
    public void Set_button3(View view)
    {
        textView1.setBackgroundColor(ContextCompat.getColor(this, R.color.purple));
        textView1.setTextColor(ContextCompat.getColor(this, R.color.gray));
        textView2.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
        textView2.setTextColor(ContextCompat.getColor(this, R.color.purple));
    }
    public void Set_button_OneColor1(View view)
    {
        linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
    }
    public void Set_button_OneColor2(View view)
    {
        linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.red));
    }
    public void Set_button_OneColor3(View view)
    {
        linearLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
    }
}
