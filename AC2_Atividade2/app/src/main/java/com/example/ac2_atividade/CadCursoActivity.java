package com.example.ac2_atividade;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ac2_atividade.services.CadCursoAsync;
import com.example.ac2_atividade.models.Curso;

public class CadCursoActivity extends AppCompatActivity {
    int codigo = 0;
    Curso curso;
    TextView txtModalidade, txtNome;

    public Curso getUsuario(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso = curso;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_curso);
        txtModalidade = findViewById(R.id.txtModalide);
        txtNome = findViewById(R.id.txtNome);
        if(getIntent().hasExtra("codigo")){
            codigo = getIntent().getIntExtra("codigo",0);
            new CadCursoAsync("GET",CadCursoActivity.this).execute("Curso/" +codigo,"");
        }
        else
            curso = new Curso();
    }
    public void carregarCampos(){
        txtNome.setText(curso.getNome());
        txtModalidade.setText(curso.getModalidade());

    }

    public void btnSalvarClick(View v){
        curso.setCodigo(codigo);
        curso.setNome(txtNome.getText().toString());
        curso.setModalidade(txtModalidade.getText().toString());

        if(codigo > 0){
            new CadCursoAsync("PUT",CadCursoActivity.this)
                    .execute("Curso/" + codigo,Curso.parseJson(curso));
        }
        else{
            new CadCursoAsync("POST",CadCursoActivity.this)
                    .execute("Curso/",Curso.parseJson(curso));
        }
    }
}