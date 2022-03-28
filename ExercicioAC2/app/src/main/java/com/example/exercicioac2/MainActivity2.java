package com.example.exercicioac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import java.io.Serializable;
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    int pontuacao;
    public void buttonClickProx(View view){
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        if (radioButton4.isChecked()){
           //pontuacao + 1 ponto
            Bundle extras = getIntent().getExtras();
            pontuacao = extras.getInt("pontuacao") + 1;
        }else{Bundle extras = getIntent().getExtras();
            pontuacao = extras.getInt("pontuacao");
        }

        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("pontuacao", pontuacao);
        startActivity(intent);
    }
}