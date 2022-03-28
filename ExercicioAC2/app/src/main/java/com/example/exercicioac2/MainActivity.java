package com.example.exercicioac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int pontuacao = 0;
    public void buttonClickProx(View view) {
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        if (radioButton2.isChecked()) {
            pontuacao = 1;
        }
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("pontuacao", pontuacao);
        startActivity(intent);

    }


}