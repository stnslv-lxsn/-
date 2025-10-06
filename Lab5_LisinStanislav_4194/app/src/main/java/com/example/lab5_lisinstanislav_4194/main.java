package com.example.lab5_lisinstanislav_4194;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class main extends Activity {

    ListView listView;
    EditText editText;
    ArrayAdapter<String> arrayAdapter;

    int selectedPosition = -1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        editText = findViewById(R.id.ediText);

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<>(this, R.layout.le);
        listView.setAdapter(arrayAdapter);

        arrayAdapter.add("первый");
        arrayAdapter.add("второй");

        listView.setOnItemClickListener((parent, view, position, id) -> {
            selectedPosition = position;
            editText.setText(arrayAdapter.getItem(position));
        });
    }

    public void onClear(View view) { arrayAdapter.clear(); }

    public void onAdd(View view)
    {
        String newItem = editText.getText().toString();

        if (newItem.isEmpty())
            editText.setText("Строка для добавления пуста.");

        arrayAdapter.add(newItem);
        editText.setText("");

    }

    public void onDel(View view) {
        if (selectedPosition != -1) {
            arrayAdapter.remove(arrayAdapter.getItem(selectedPosition));
            selectedPosition = -1;
            editText.setText("");
        }
    }

    public void onEdit(View view) {
        if (selectedPosition != -1) {
            String newItem = editText.getText().toString();
            if (!newItem.isEmpty()) {
                arrayAdapter.remove(arrayAdapter.getItem(selectedPosition));
                arrayAdapter.insert(newItem, selectedPosition);
                selectedPosition = -1;
                editText.setText("");
            }
        }
    }
}

