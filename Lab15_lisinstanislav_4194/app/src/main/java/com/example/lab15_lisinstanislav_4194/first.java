package com.example.lab15_lisinstanislav_4194;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class first extends MyBaseActivity
{
    Button b_Add;
    Intent intent;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    List<String> notes = new ArrayList<>();

    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.first_act);

        b_Add = findViewById(R.id.b_add);
        intent = new Intent(this, second.class);

        arrayAdapter = new ArrayAdapter<>(this, R.layout.text1, notes);

        listView = findViewById(R.id.listV);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                intent.putExtra(EXTRA_TEXT, notes.get(position));
                intent.putExtra(EXTRA_ID, position);
                startActivity(intent);
            }
        });
    }
    public void startActivity(View view) { startActivityForResult(intent, CREATE_ACTION);  }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            switch (requestCode)
            {
                case CREATE_ACTION:
                    notes.add(data.getStringExtra(EXTRA_TEXT));
                    break;
                case EDIT_ACTION:
                    int position = data.getIntExtra(EXTRA_ID, -1);
                    if (position != -1)
                        notes.set(position, data.getStringExtra(EXTRA_TEXT));
                    break;
            }
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
