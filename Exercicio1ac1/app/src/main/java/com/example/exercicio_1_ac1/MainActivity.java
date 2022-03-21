package com.example.exercicio_1_ac1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        }
    int numero;
    String Numerooo;
    double resultado;
    String nome;
    int idade;
    char sexo;
    String s;
    double valorAutomovel;
    Apolice apolicee = new Apolice();

    public void CalcularClick(View view) {
        apolicee.setNumero(apolicee.getNumero()+1);
        numero = apolicee.getNumero();
        Numerooo = String.valueOf(numero);

        EditText editTextNumero = (EditText) findViewById(R.id.editTextNumero);
        editTextNumero.setText(Numerooo);

        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        nome = editTextNome.getText().toString();
        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        idade = Integer.parseInt(editTextIdade.getText().toString());
        EditText editTextSexo = (EditText) findViewById(R.id.editTextSexo);
        s = editTextSexo.getText().toString();
        sexo = s.charAt(0);
        EditText editTextValor = (EditText) findViewById(R.id.editTextValor);
        valorAutomovel = Double.parseDouble(editTextValor.getText().toString());
        //setando valores
        apolicee.setNome(nome);
        apolicee.setIdade(idade);
        apolicee.setSexo(sexo);
        apolicee.setValorAutomovel(valorAutomovel);
        //calculando
        EditText editTextResultado = (EditText) findViewById(R.id.editTextResultado);
        resultado = apolicee.calcularValor();
        editTextResultado.setText(String.valueOf(resultado));
    }
}