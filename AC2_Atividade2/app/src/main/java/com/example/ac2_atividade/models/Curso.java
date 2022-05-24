package com.example.ac2_atividade.models;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome,modalidade;

    public Curso(int codigo, String nome, String modalidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.modalidade = modalidade;
    }

    public static Curso parseObject(String json){
        Curso curso = new Curso();
        try{
            JSONObject obj = new JSONObject(json);
            // usuario.setId(obj.getInt("id"));
            curso.setNome(obj.getString("nome"));
            curso.setModalidade(obj.getString("modalidade"));

            return curso;
        }
        catch (Exception ex){
            return curso;
        }
    }

    public static String parseJson(Curso curso){
        JSONObject obj = new JSONObject();
        try{
            obj.put("codigo",""+curso.getCodigo());
            obj.put("nome",curso.getNome());
            obj.put("modalidade",curso.getModalidade());
            return obj.toString();
        }
        catch (Exception ex){
            return "";
        }
    }



    public static ArrayList<Curso> parseArrayList(String json){
        ArrayList<Curso> cursos = new ArrayList<>();
        try{
            JSONArray array = new JSONArray(json);
            for(int i = 0; i < array.length(); i++){
                Curso curso = new Curso();
                JSONObject obj = array.getJSONObject(i);
                curso.setNome(obj.getString("nome"));
                curso.setCodigo(obj.getInt("codigo"));
                curso.setModalidade(obj.getString("modalidade"));
                cursos.add(curso);
            }
            return cursos;
        }
        catch (Exception ex){
            return null;
        }
    }






    public Curso() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

}
