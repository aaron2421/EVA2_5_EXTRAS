package com.example.eva2_5_extras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Intent sec;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sec = new Intent(this, secundaria.class);
        editText = findViewById(R.id.editText);
    }

    public void enviarInfo(View v){
        String msj = editText.getText().toString();
        sec.putExtra("datos", msj);
        sec.putExtra("num", 100);
        startActivity(sec);
    }
}
