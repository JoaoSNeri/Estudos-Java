package Atividade1;

import java.util.Scanner;

public class CadastroEmpresa {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== Cadastro de Empresa =====");
            System.out.println("1. Cadastrar Empresa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    cadastrarEmpresa(scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }

    public static void cadastrarEmpresa(Scanner scanner) {
        System.out.print("Digite o nome da empresa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CNPJ da empresa: ");
        String cnpj = scanner.nextLine();

        System.out.print("Digite a renda bruta mensal da empresa: ");
        double rendaBruta = scanner.nextDouble();

        Empresa novaEmpresa = new Empresa(nome, cnpj, rendaBruta);

        System.out.println("\nEmpresa cadastrada com sucesso!");
    }
}
