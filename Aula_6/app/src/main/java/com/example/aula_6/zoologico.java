package com.example.aula_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class zoologico extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoologico);
    }
    //abrir tela zoologico detalhes
    public void btnAbrirTelaZoologicoDetalhes(View view) {
        Intent intent = new Intent(this, detalhesZoologico.class);
        startActivity(intent);
    }
    public void btnVoltarClick(View view){
        finish();
    }


}