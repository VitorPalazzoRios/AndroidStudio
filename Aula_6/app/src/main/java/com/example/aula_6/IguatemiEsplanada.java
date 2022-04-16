package com.example.aula_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IguatemiEsplanada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iguatemi_esplanada);
    }
    //abrir tela iguatemi detalhes
    public void btnAbrirTelaIguatemiDetalhes(View view) {
        Intent intent = new Intent(this, detalhesIguatemi.class);
        startActivity(intent);
    }
    public void btnVoltarClick(View view){
        finish();
    }
}