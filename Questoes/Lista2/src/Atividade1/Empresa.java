package Atividade1;

public class Empresa {
	private String nome;
    private String cnpj;
    private double rendaBrutaMensal;

    public Empresa(String nome, String cnpj, double rendaBrutaMensal) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.rendaBrutaMensal = rendaBrutaMensal;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getRendaBrutaMensal() {
        return rendaBrutaMensal;
    }
}
