package recyclerCurso;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exercicio3.R;

import java.util.ArrayList;

import dataset.CursodataSet;
import models.Curso;
public class CursoAdapter extends RecyclerView.Adapter<CursoHolder> {
    private ArrayList<Curso> Cursos;

    public CursoAdapter(ArrayList<Curso> Cursos){
        this.Cursos = Cursos;
    }

    @NonNull
    @Override
    public CursoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CursoHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.card_item_curso,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CursoHolder holder, int position) {
        holder.nome.setText(Cursos.get(position).getNome());
        holder.dias.setText(Cursos.get(position).getDias());
        holder.valor.setText("Valor: " + Integer.toString(Cursos.get(position).getValor()) + ",00");
        holder.buttonExcluir.setOnClickListener(
                view -> excluirItem(position));
    }
    public void addItem(Curso curso){
        CursodataSet.addPessoa(curso);
        notifyItemInserted(getItemCount());
    }
    private void excluirItem(int position){
        Cursos.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, Cursos.size());
    }

    @Override
    public int getItemCount() {
        return Cursos != null ? Cursos.size() : 0;
    }
}
