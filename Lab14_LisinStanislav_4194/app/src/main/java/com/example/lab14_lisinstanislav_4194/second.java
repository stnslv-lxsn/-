package com.example.lab14_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class second extends Activity {

    EditText editText1, editText2;

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.second_act);

        editText1 = findViewById(R.id.e1);
        editText1.setText(getIntent().getStringExtra("edit1"));

        editText2 = findViewById(R.id.e2);
        editText2.setText(getIntent().getStringExtra("edit2"));
    }

    public void OK(View view)
    {
        Intent intent = new Intent(this, first.class);
        intent.putExtra("edit3", editText1.getText().toString());
        intent.putExtra("edit4", editText2.getText().toString());
        startActivity(intent);
    }
    public void Cancel(View view) {
        Intent intent = new Intent(this, first.class);
        intent.putExtra("edit3", getIntent().getStringExtra("edit1"));
        intent.putExtra("edit4", getIntent().getStringExtra("edit2"));
        startActivity(intent);
    }
}
