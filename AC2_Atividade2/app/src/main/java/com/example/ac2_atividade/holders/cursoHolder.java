package com.example.ac2_atividade.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ac2_atividade.R;

public class cursoHolder extends RecyclerView.ViewHolder {
    public TextView txtNome;
    public TextView txtModalidade;

    public cursoHolder(@NonNull View itemView) {
        super(itemView);
        txtNome = (TextView)itemView.findViewById(R.id.textNome);
        txtModalidade = (TextView) itemView.findViewById(R.id.textModalidade);
    }

}
