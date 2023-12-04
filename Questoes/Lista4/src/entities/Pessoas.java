package entities;

public class Pessoas {
    private String nome;
    private String cpf;
    private String matricula;

    public Pessoas(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Matrícula: " + matricula;
    }
}
