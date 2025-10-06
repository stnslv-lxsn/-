package com.example.lab11_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class main extends Activity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.main_act);

        sharedPreferences = getSharedPreferences(getString(R.string.select_color), MODE_PRIVATE);
        restore();
    }
    public void openActivity(View view) { startActivity(new Intent(this, changeColor.class)); }
    @Override
    protected void onResume() {
        super.onResume();
        restore();
    }
    private void restore()
    {
        int savedColor = sharedPreferences.getInt("selected_color", changeColor.savedColor);
        getWindow().getDecorView().setBackgroundColor(savedColor);
    }
}
