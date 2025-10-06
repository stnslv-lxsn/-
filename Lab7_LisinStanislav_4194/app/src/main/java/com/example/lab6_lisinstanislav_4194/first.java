package com.example.lab6_lisinstanislav_4194;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class first extends Activity {

    ListView listView1, listView2;
    EditText editText;
    ArrayAdapter<String> arrayAdapter1, arrayAdapter2;

    public void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.first_act);

        listView1 = findViewById(R.id.list1);
        listView2 = findViewById(R.id.list2);

        editText = findViewById(R.id.ediText);

        arrayAdapter1 = new ArrayAdapter<>(this, R.layout.text1);
        arrayAdapter1.addAll(getResources().getStringArray(R.array.elements1));

        arrayAdapter2 = new ArrayAdapter<>(this, R.layout.text2);
        arrayAdapter2.addAll(getResources().getStringArray(R.array.elements2));

        listView1.setAdapter(arrayAdapter1);
        listView2.setAdapter(arrayAdapter2);
    }
    public void onBackPressed(View view) { super.onBackPressed(); }

    public void onAdd1(View view) { arrayAdapter1.add(editText.getText().toString()); }
    public void onAdd2(View view) { arrayAdapter2.add(editText.getText().toString()); }
}
