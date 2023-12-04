package application;

import entities.Pessoas;

public class Graduacao_joaovictorsantosneri extends Pessoas {
    private String cursoGraduacao;

    public Graduacao_joaovictorsantosneri(String nome, String cpf, String matricula, String cursoGraduacao) {
        super(nome, cpf, matricula);
        this.cursoGraduacao = cursoGraduacao;
    }

    @Override
    public String toString() {
        return "Graduação: " + super.toString() + ", Curso: " + cursoGraduacao;
    }
}
