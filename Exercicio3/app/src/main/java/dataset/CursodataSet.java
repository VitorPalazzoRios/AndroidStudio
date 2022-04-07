package dataset;

import java.util.ArrayList;

import models.Curso;

public class CursodataSet {
    private static ArrayList<Curso> cursos;
    public static ArrayList<Curso> getItens() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(1, 125, "Musicalização Infantil nível I", "segunda ou terça-feira de manhã"));
        cursos.add(new Curso(2, 135, "Musicalização Infantil nível II", "quarta ou quinta-feira de manhã"));
        cursos.add(new Curso(3, 145, "Musicalização Infantil nível III ", "quinta ou sexta-feira de manhã"));
        cursos.add(new Curso(4, 150, "Musicalização básica", "quinta ou sexta-feira a tarde"));
        cursos.add(new Curso(5, 200, "Piano clássico ", "segunda, terça ou sexta de manhã"));
    return cursos;
    }


public static void addPessoa(Curso curso) {
    cursos.add(curso);
}
}
