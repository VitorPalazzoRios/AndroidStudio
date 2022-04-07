package com.example.exercicio3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import dataset.CursodataSet;
import models.Curso;
import recyclerCurso.CursoAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listcurso;
    private CursoAdapter cursoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listcurso = (RecyclerView) findViewById(R.id.listcurso);
        setupRecyclercurso();
    }
    public void buttonAddClick(View view){
        cursoAdapter.addItem(new Curso(99,00,"Curso x","segunda-feira"));
    }
    public void setupRecyclercurso(){
        //formato em lista vertical
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        //formato em grid
        // GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        //formato em lista horizontal
        // LinearLayoutManager layoutManager = new LinearLayoutManager(
        //                               this,LinearLayoutManager.HORIZONTAL,false);

        listcurso.setLayoutManager(layoutManager);
        cursoAdapter = new CursoAdapter(CursodataSet.getItens());
        listcurso.setAdapter(cursoAdapter);
        listcurso.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));

    }
}