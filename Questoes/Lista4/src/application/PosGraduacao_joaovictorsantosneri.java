package application;

import entities.Pessoas;

public class PosGraduacao_joaovictorsantosneri extends Pessoas {
    private String cursoPosgraduacao;

    public PosGraduacao_joaovictorsantosneri(String nome, String cpf, String matricula, String cursoPosgraduacao) {
        super(nome, cpf, matricula);
        this.cursoPosgraduacao = cursoPosgraduacao;
    }

    @Override
    public String toString() {
        return "Pós-Graduação: " + super.toString() + ", Curso: " + cursoPosgraduacao;
    }
}
