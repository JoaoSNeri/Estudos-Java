package application;

import java.util.Scanner;
import entities.Pessoas;

public class Programa_joaovictorsantosneri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoas[] cadastros = new Pessoas[10];
        int opcao;

        do {
            exibirMenu();
            opcao = obterOpcao(scanner);

            switch (opcao) {
                case 1:
                    cadastrarGraduacao(scanner, cadastros);
                    break;
                case 2:
                    cadastrarPosGraduacao(scanner, cadastros);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);

        System.out.println("\nLista de Cadastros:\n");
        for (Pessoas pessoa : cadastros) {
            if (pessoa != null) {
                System.out.println(pessoa);
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\nBem Vindo ao Menu\n");
        System.out.println("1 – Cadastro Graduação");
        System.out.println("2 – Cadastro PosGraduação");
        System.out.println("3 – Sair\n");
    }

    private static int obterOpcao(Scanner scanner) {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private static void cadastrarGraduacao(Scanner scanner, Pessoas[] cadastros) {
        if (verificarCapacidade(cadastros)) {
        	
        	scanner.nextLine();
        	
        	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        	System.out.print("Informe os dados a baixo!\n\n");
        	
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.next();

            System.out.print("Matrícula: ");
            String matricula = scanner.next();
            
            scanner.nextLine();

            System.out.print("Curso de Graduação: ");
            String cursoGraduacao = scanner.nextLine();

            Graduacao_joaovictorsantosneri graduacao = new Graduacao_joaovictorsantosneri(nome, cpf, matricula, cursoGraduacao);
            cadastrarPessoa(cadastros, graduacao);
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

    private static void cadastrarPosGraduacao(Scanner scanner, Pessoas[] cadastros) {
        if (verificarCapacidade(cadastros)) {
        	
        	scanner.nextLine();
        	
        	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        	System.out.print("Informe os dados a baixo!\n\n");
        	
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.next();

            System.out.print("Matrícula: ");
            String matricula = scanner.next();
            
            scanner.nextLine();

            System.out.print("Curso de Pós-Graduação: ");
            String cursoPosgraduacao = scanner.nextLine();

            PosGraduacao_joaovictorsantosneri posGraduacao = new PosGraduacao_joaovictorsantosneri(nome, cpf, matricula, cursoPosgraduacao);
            cadastrarPessoa(cadastros, posGraduacao);
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }

    private static boolean verificarCapacidade(Pessoas[] cadastros) {
        return cadastros[cadastros.length - 1] == null;
    }

    private static void cadastrarPessoa(Pessoas[] cadastros, Pessoas pessoa) {
        for (int i = 0; i < cadastros.length; i++) {
            if (cadastros[i] == null) {
                cadastros[i] = pessoa;
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Cadastro realizado com sucesso!");
                break;
            }
        }
    }
}

