package com.example.lab17_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class first_a extends Activity {
    protected main Main;

    protected String s1, s2;

    protected EditText ed1, ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        Main = (main) getApplicationContext();

        s1 = Main.getS1();
        s2 = Main.getS2();

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
    }

    public void GetS(View view)
    {
        ed1.setText(s1);
        ed2.setText(s2);
    }
    public void SetS(View view)
    {
        Main.setS1(getString(R.string.str1));
        Main.setS2(getString(R.string.str2));

        s1 = Main.getS1();
        s2 = Main.getS2();

        ed1.setText(s1);
        ed2.setText(s2);
    }
}
