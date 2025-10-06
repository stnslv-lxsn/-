package com.example.lab13_lisinstanislav_4194;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class main extends Activity implements TextWatcher {

    EditText editText;
    TextView textView;
    Button button;

    protected void onCreate(Bundle a) {
        super.onCreate(a);
        setContentView(R.layout.main_act);

        editText = findViewById(R.id.editT);
        editText.addTextChangedListener(this);

        textView = findViewById(R.id.textV);

        button = findViewById(R.id.b_C);
        button.setEnabled(false);
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
    {
        if(editText.getText().length() == 0 || editText.getText().toString().trim().equals(""))
        {
            button.setEnabled(false);
            button.setText(R.string.b_Off);

            button.setBackgroundColor(getColor(R.color.white));
            button.setTextColor(getColor(R.color.black));
        }
        else
        {
            button.setEnabled(true);
            button.setText(R.string.b_On);

            button.setBackgroundColor(getColor(R.color.purple_200));
            button.setTextColor(getColor(R.color.teal_700));
        }
    }
    public void EditText_to_TextView(View view) { textView.setText(textView.getText().toString() + editText.getText()); }

    @Override
    public void afterTextChanged(Editable editable) { }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
}
