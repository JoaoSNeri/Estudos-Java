package entities;

import java.util.Scanner;

public interface Produto {
    void cadastrarProduto(Scanner scanner);
    void removerProduto();
    void editarProduto(Scanner scanner);
    void imprimirInformacoes();
    String getNomeProduto();
}
