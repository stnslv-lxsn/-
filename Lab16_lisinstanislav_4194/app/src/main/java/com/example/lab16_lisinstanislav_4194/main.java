package com.example.lab16_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class main extends Activity {

    Button b11;

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.main_act);

        b11 = findViewById(R.id.b11);
    }
    public void ShowToast(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(),
                R.string.catfood,
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    public void ShowToast2(View view)
    {
        Toast toast = Toast.makeText(getApplicationContext(),
                R.string.catfood,
                Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 0);
        toast.show();
    }
    public void ShowToastWithPicture(View view) {
        Toast toast3 = Toast.makeText(getApplicationContext(),
                R.string.catfood, Toast.LENGTH_LONG);
        toast3.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast3.getView();
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.hungrycat);
        toastContainer.addView(catImageView, 0);
        toastContainer.setBackgroundColor(Color.TRANSPARENT);
        toast3.show();
    }
    public void startAct4(View view) { startActivity(new Intent(this, zad4.class));}
}
