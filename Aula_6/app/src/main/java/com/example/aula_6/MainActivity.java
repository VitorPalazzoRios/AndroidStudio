package com.example.aula_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Botão abrir tela do zoologico
    public void btnAbrirTelaZoologico(View view) {
        Intent intent = new Intent(this, zoologico.class);
        startActivity(intent);
    }
    //Botão abrir tela do Iguatemi Esplanada
    public void btnAbrirTelaIguatemiEsplanada(View view) {
        Intent intent = new Intent(this, IguatemiEsplanada.class);
        startActivity(intent);
    }
    //Botão abrir tela do Parque Natural Municipal Chico Mendes
    public void btnAbrirTelaParqueNaturalMunicipalChicoMendes(View view) {
        Intent intent = new Intent(this, ParqueNaturalMunicipalChicoMendes.class);
        startActivity(intent);
    }
}