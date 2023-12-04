package application;

import entities.Monitores;
import entities.Impressoras;
import entities.Placavideos;
import entities.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        int opcao;
        do {
        	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        	System.out.println("----------------------");
        	System.out.println("Bem Vindo A Canaa Tech");
        	System.out.println("----------------------");
            System.out.println("\nMENU de escolha de tipo de produto:\n");
            System.out.println("1. Monitores");
            System.out.println("2. Impressoras");
            System.out.println("3. Placavideos");
            System.out.println("4. Ver Estoque");
            System.out.println("5. Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    menuProduto(produtos, "Monitor", scanner);
                    break;
                case 2:
                    menuProduto(produtos, "Impressora", scanner);
                    break;
                case 3:
                    menuProduto(produtos, "Placa de Vídeo", scanner);
                    break;
                case 4:
                    imprimirEstoque(produtos);
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    System.out.println("\nPressione Enter para continuar...");
                    new Scanner(System.in).nextLine();
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    System.out.println("\nPressione Enter para continuar...");
                    new Scanner(System.in).nextLine();
            }
        } while (opcao != 5);
    }

    private static void menuProduto(ArrayList<Produto> listaProdutos, String tipoProduto, Scanner scanner) {
        int opcao;
        do {
        	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Menu de " + tipoProduto + "s\n");
            System.out.println("1. Cadastrar");
            System.out.println("2. Remover");
            System.out.println("3. Editar");
            System.out.println("4. Voltar");
            System.out.print("\nEscolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarProduto(listaProdutos, tipoProduto, scanner);
                    break;
                case 2:
                    removerProduto(listaProdutos, tipoProduto, scanner);
                    break;
                case 3:
                    editarProduto(listaProdutos, tipoProduto, scanner);
                    break;
                case 4:
                    System.out.println("\nVoltando...");
                    System.out.println("\nPressione Enter para continuar...");
                    new Scanner(System.in).nextLine();
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    System.out.println("\nPressione Enter para continuar...");
                    new Scanner(System.in).nextLine();
            }
        } while (opcao != 4);
    }

    private static void cadastrarProduto(ArrayList<Produto> listaProdutos, String tipoProduto, Scanner scanner) {
        Produto produto;
        if (tipoProduto.equals("Monitor")) {
            produto = new Monitores();
        } else if (tipoProduto.equals("Impressora")) {
            produto = new Impressoras();
        } else {
            produto = new Placavideos();
        }

        produto.cadastrarProduto(scanner);

        listaProdutos.add(produto);
        System.out.println("");
        System.out.println(tipoProduto + " cadastrado com sucesso!\n");
        System.out.println("Pressione Enter para continuar...");
        new Scanner(System.in).nextLine();
        
    }

    private static void removerProduto(ArrayList<Produto> listaProdutos, String tipoProduto, Scanner scanner) {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Escolha o " + tipoProduto + " a ser removido:\n");
        listarProdutos(listaProdutos);
        int escolha = scanner.nextInt();
        if (escolha >= 0 && escolha < listaProdutos.size()) {
            listaProdutos.remove(escolha);
            System.out.println(tipoProduto + " removido com sucesso!");
            System.out.println("\nPressione Enter para continuar...");
            new Scanner(System.in).nextLine();
        } else {
            System.out.println("\nEscolha inválida.");
            System.out.println("\nPressione Enter para continuar...");
            new Scanner(System.in).nextLine();
        }
    }

    private static void editarProduto(ArrayList<Produto> listaProdutos, String tipoProduto, Scanner scanner) {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    	System.out.println("Escolha o " + tipoProduto + " a ser editado:\n");
        listarProdutos(listaProdutos);
        int escolha = scanner.nextInt();
        if (escolha >= 0 && escolha < listaProdutos.size()) {
            listaProdutos.get(escolha).editarProduto(scanner);
            System.out.println("");
            System.out.println(tipoProduto + " editado com sucesso!");
            System.out.println("\nPressione Enter para continuar...");
            new Scanner(System.in).nextLine();
        } else {
            System.out.println("Escolha inválida.");
            System.out.println("\nPressione Enter para continuar...");
            new Scanner(System.in).nextLine();
        }
    }

    private static void imprimirEstoque(ArrayList<Produto> listaProdutos) {
    	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        if (listaProdutos.isEmpty()) {
            System.out.println("\nO estoque está vazio.");
        } else {
            for (Produto produto : listaProdutos) {
            	System.out.println();
                produto.imprimirInformacoes();
                System.out.println();
            }
        }

        System.out.println("Pressione Enter para continuar...");
        new Scanner(System.in).nextLine();
    }

    private static void listarProdutos(ArrayList<Produto> listaProdutos) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.println(i + ". " + listaProdutos.get(i).getNomeProduto());
        }
    }
}
