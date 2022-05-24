package com.example.ac2_atividade.adapters;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2_atividade.CadCursoActivity;
import com.example.ac2_atividade.MainActivity;
import com.example.ac2_atividade.R;
import com.example.ac2_atividade.models.Curso;
import com.example.ac2_atividade.holders.cursoHolder;
import java.util.ArrayList;

public class cursoAdapter extends RecyclerView.Adapter<cursoHolder> {
    private final ArrayList<Curso> cursos;
    public cursoAdapter(ArrayList<Curso>cursos){
        this.cursos = cursos;
    }

    @NonNull
    @Override
    public cursoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new cursoHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_listagem_curso,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull cursoHolder holder, int position) {
        holder.txtNome.setText(cursos.get(position).getNome());
        holder.txtModalidade.setText(cursos.get(position).getModalidade());
        //Editar Item - Click
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(holder.itemView.getContext(), CadCursoActivity.class);
                i.putExtra("codigo",cursos.get(holder.getAdapterPosition()).getCodigo());
                holder.itemView.getContext().startActivity(i);
            }
        });

        //Excluir Item - LongClick
        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder alert = new AlertDialog.Builder(v.getContext());
                alert.setMessage("Deseja Excluir esse item?");
                alert.setTitle("Atenção");
                alert.setNegativeButton("Não",null);
                alert.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ((MainActivity)holder.itemView.getContext())
                                .excluirCurso(cursos.get(
                                        holder.getAdapterPosition()).getCodigo()+"");
                    }
                });
                alert.show();
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return cursos != null ? cursos.size() : 0;
    }



}
