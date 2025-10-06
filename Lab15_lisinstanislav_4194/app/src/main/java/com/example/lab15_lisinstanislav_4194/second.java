package com.example.lab15_lisinstanislav_4194;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second extends MyBaseActivity implements TextWatcher
{
    EditText editText;
    Button b_Ok, b_Cancel;
    Intent intent;
    int position;

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.second_act);

        b_Ok = findViewById(R.id.b_ok);
        b_Cancel = findViewById(R.id.b_cancel);

        intent = new Intent(this, first.class);
        position = intent.getIntExtra(EXTRA_ID, -1);

        editText = findViewById(R.id.ed1);
        editText.setText(intent.getStringExtra(EXTRA_TEXT));
    }
    public void saveChanges(View view)
    {
        intent.putExtra(EXTRA_TEXT, editText.getText().toString());
        if (position != -1)
            intent.putExtra(EXTRA_ID, position);

        setResult(RESULT_OK, intent);
        finish();
    }
    public void closeActivity(View view) { startActivity(intent); }
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) { b_Ok.setEnabled(s.length() > 0); }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
    @Override
    public void afterTextChanged(Editable s) {}

}
