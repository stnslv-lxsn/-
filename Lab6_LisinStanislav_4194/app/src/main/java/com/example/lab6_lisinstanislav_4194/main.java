package com.example.lab6_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class main extends Activity {

    public void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.main_act);
    }
    public void openFirstActivity(View view) { startActivity(new Intent(this, first.class)); }
    public void openSecondActivity(View view) { startActivity(new Intent(this, second.class)); }
}
