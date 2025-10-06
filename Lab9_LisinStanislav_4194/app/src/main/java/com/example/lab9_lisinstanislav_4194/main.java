package com.example.lab9_lisinstanislav_4194;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class main extends Activity {

    private EditText editTextString1, editTextString2, editTextInt;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.main_act);

        editTextString1 = findViewById(R.id.editTextString1);
        editTextString2 = findViewById(R.id.editTextString2);
        editTextInt = findViewById(R.id.editTextInt);

        sharedPreferences = getSharedPreferences(getString(R.string.settings_name), MODE_PRIVATE);
    }
    @Override
    protected void onResume() {
        super.onResume();

        editTextString1.setText(sharedPreferences.getString(getString(R.string.string_setting_1), ""));
        editTextString2.setText(sharedPreferences.getString(getString(R.string.string_setting_2), ""));
        editTextInt.setText(String.valueOf(sharedPreferences.getInt(getString(R.string.integer_setting), 0)));
    }
    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(getString(R.string.string_setting_1), editTextString1.getText().toString());
        editor.putString(getString(R.string.string_setting_2), editTextString2.getText().toString());
        editor.putInt(getString(R.string.integer_setting), Integer.parseInt(editTextInt.getText().toString()));
        editor.apply();
    }
}
