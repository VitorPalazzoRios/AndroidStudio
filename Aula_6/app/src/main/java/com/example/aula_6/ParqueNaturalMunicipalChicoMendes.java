package com.example.aula_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ParqueNaturalMunicipalChicoMendes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_natural_municipal_chico_mendes);
    }
    //abrir tela parque natural municipal chico mendes detalhes
    public void btnAbrirTelaParqueDetalhes(View view) {
        Intent intent = new Intent(this, detalhesParque.class);
        startActivity(intent);
    }
    public void btnVoltarClick(View view){
        finish();
    }
}