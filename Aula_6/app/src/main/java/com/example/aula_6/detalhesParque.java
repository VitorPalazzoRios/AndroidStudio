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

public class detalhesParque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_parque);
    }
    //abrir mapa
    public void btnAbrirMapa2(View view){
        Uri uri = Uri.parse("geo:0,0?q=Parque+Natural+Chico+Mendes");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        //intent.setAction("com.google.android.apps.maps");
        startActivity(intent);
    }
    //abrir pagina web
    public void btnAbrirNavegadorClick2(View vi){
        Uri uri = Uri.parse("https://turismo.sorocaba.sp.gov.br/visite/parque-natural-chico-mendes/");
        Intent intent = new Intent (Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    //telefonar
    public void btnTelefonarCLick2(View view){
        Uri uri = Uri.parse("tel:0151532281256");
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