package recyclerCurso;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.exercicio3.R;

public class CursoHolder extends RecyclerView.ViewHolder {
    public TextView nome;
    public TextView dias;
    public TextView valor;
    public ImageButton buttonExcluir;

    public CursoHolder(View itemView) {
        super(itemView);
        nome = (TextView) itemView.findViewById(R.id.textNome);
        dias = (TextView) itemView.findViewById(R.id.textDias);
        valor = (TextView) itemView.findViewById(R.id.textValor);
        buttonExcluir = (ImageButton) itemView.findViewById(R.id.buttonExcluir);
    }
}