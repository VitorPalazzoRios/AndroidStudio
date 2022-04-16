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

public class detalhesIguatemi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_iguatemi);
    }
    //abrir mapa
    public void btnAbrirMapa1(View view){
        Uri uri = Uri.parse("geo:0,0?q=Shopping+Iguatemi+Esplanada");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        //intent.setAction("com.google.android.apps.maps");
        startActivity(intent);
    }
    //abrir pagina web
    public void btnAbrirNavegadorClick1(View vi){
        Uri uri = Uri.parse("https://iguatemi.com.br/esplanada/");
        Intent intent = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    //telefonar
    public void btnTelefonarCLick1(View view){
        Uri uri = Uri.parse("tel:01501530421400");
        Intent intent = new Intent(Intent.ACTION_DIAL,uri);
        //startActivity(intent);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE);
        if (permissionCheck != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},1);

        } else {
            startActivity(intent);
        }

    }
    public void btnVoltarClick(View view){
        finish();
    }

}