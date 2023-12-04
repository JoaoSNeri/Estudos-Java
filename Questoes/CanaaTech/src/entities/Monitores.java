package entities;

import java.util.Scanner;

public class Monitores implements Produto {
    private String nomeProduto;
    private int quantidade;
    private String descricao;

    @Override
    public void cadastrarProduto(Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Digite o nome do monitor: ");
        this.nomeProduto = scanner.nextLine();
        System.out.print("Digite a quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Digite a descrição: ");
        this.descricao = scanner.nextLine();
    }

    @Override
    public void removerProduto() {
        this.nomeProduto = null;
        this.quantidade = 0;
        this.descricao = null;
    }

    @Override
    public void editarProduto(Scanner scanner) {
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("Digite o novo nome do monitor: ");
        this.nomeProduto = scanner.nextLine();
        System.out.print("Digite a nova quantidade: ");
        this.quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado
        System.out.print("Digite a nova descrição: ");
        this.descricao = scanner.nextLine();
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome do Monitor: " + this.nomeProduto);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Descrição: " + this.descricao);
    }

    @Override
    public String getNomeProduto() {
        return this.nomeProduto;
    }
}
