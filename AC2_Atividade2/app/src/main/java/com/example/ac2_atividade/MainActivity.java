package com.example.ac2_atividade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ac2_atividade.adapters.cursoAdapter;
import com.example.ac2_atividade.models.Curso;
import com.example.ac2_atividade.services.ListaCursoAsync;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Curso> listaCursos;
    RecyclerView cursoRecycler;
    cursoAdapter CursoAdapter;
    ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaCursos = new ArrayList<>();
        cursoRecycler = (RecyclerView) findViewById(R.id.recyclerCurso);
        progressDialog = new ProgressDialog(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
        buscarCursos();
    }

    public void buscarCursos() {
        new ListaCursoAsync("GET",MainActivity.this).execute("/Curso","");
    }
    public void excluirCurso(String id){
        new ListaCursoAsync("DELETE",MainActivity.this)
                .execute("Curso/"+id,"");
    }

    public void addCursoClick(View v){
        Intent i = new Intent(MainActivity.this, CadCursoActivity.class);
        startActivity(i);
    }

    public void setListaCursos(ArrayList<Curso> cursos){
        this.listaCursos = cursos;
    }
    public void setupRecyclerUsuario(){
        LinearLayoutManager layout = new LinearLayoutManager(this);
        cursoRecycler.setLayoutManager(layout);
        CursoAdapter = new cursoAdapter(listaCursos);
        cursoRecycler.setAdapter(CursoAdapter);

        cursoRecycler.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }

}