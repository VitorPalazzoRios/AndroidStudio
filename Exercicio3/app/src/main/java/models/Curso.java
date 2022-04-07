package models;

public class Curso {
    private int id,valor;
    private String nome,dias;
    public Curso() {
    }

    public Curso(int id, int valor, String nome, String dias) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }
}
