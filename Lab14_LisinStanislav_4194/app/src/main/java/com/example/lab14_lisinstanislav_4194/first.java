package com.example.lab14_lisinstanislav_4194;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class first extends Activity {

    EditText editText1, editText2;

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.first_act);

        editText1 = findViewById(R.id.e1);
        editText1.setText(getIntent().getStringExtra("edit3"));

        editText2 = findViewById(R.id.e2);
        editText2.setText(getIntent().getStringExtra("edit4"));
    }

    public void openActivity(View view)
    {
        Intent intent = new Intent(this, second.class);
        intent.putExtra("edit1", editText1.getText().toString());
        intent.putExtra("edit2", editText2.getText().toString());
        startActivity(intent);
    }
}
