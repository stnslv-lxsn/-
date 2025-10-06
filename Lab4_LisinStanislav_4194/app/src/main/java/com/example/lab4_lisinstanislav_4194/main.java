package com.example.lab4_lisinstanislav_4194;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class main extends Activity implements View.OnClickListener {
    Double num1, num2;
    EditText Text1, Text2;
    TextView result;

    public void onCreate(Bundle aboba)
    {
        super.onCreate(aboba);
        setContentView(R.layout.main_act);

        Text1 = findViewById(R.id.editTextNumberSigned);
        Text2 = findViewById(R.id.editTextNumberSigned2);

        result = findViewById(R.id.textView);
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(View view)
    {
        num1 = Double.parseDouble(Text1.getText().toString());
        num2 = Double.parseDouble(Text2.getText().toString());

        switch (view.getId())
        {
            case R.id.button:
                result.setText(String.format("%s + %s = %s", num1, num2, round(num1 + num2, 2)));
                break;
            case R.id.button2:
                result.setText(String.format("%s - %s = %s", num1, num2, round(num1 - num2,2)));
                break;
            case R.id.button3:
                result.setText(String.format("%s * %s = %s", num1, num2, round(num1 * num2, 2)));
                break;
            case R.id.button4:
                if (num2 != 0) {
                    result.setText(String.format("%s / %s = %s", num1, num2, round(num1 / num2, 2)));
                } else {
                    result.setText("Division by zero");
                }
                break;
        }
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
