package com.example.exercicioac2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import java.io.Serializable;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
        int pontuacao;
        public void buttonClickProx(View view){
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        if (radioButton5.isChecked()){
            //pontuacao + 1 ponto
            Bundle extras = getIntent().getExtras();
            pontuacao = extras.getInt("pontuacao") + 1;
        }else{Bundle extras = getIntent().getExtras();
            pontuacao = extras.getInt("pontuacao");
        }
        TextView textViewPontuacao = (TextView) findViewById(R.id.textViewPontuacao);
        textViewPontuacao.setText(Integer.toString(pontuacao));
    }
}