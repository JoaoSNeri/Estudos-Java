package Atividade2;

import java.util.Scanner;

public class Concessionaria {
	 public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				String senha;

				do {
				    System.out.print("Digite a senha: ");
				    senha = scanner.nextLine();
				    if (!senha.equals("123")) {
				        System.out.println("ERRO DE SENHA");
				    }
				} while (!senha.equals("123"));

				System.out.println("SENHA CORRETA");

				int opcao;
				Cliente cliente = new Cliente();
				Carro carro = new Carro();
				Acessorio acessorio = new Acessorio();

				do {
				    System.out.println("\nMenu:");
				    System.out.println("1. Cadastro de cliente");
				    System.out.println("2. Compra de carro");
				    System.out.println("3. Compra de acessório");
				    System.out.println("4. Sair");
				    System.out.print("Escolha uma opção: ");
				    opcao = Integer.parseInt(scanner.nextLine());

				    switch (opcao) {
				        case 1:
				            System.out.print("Nome: ");
				            cliente.nome = scanner.nextLine();
				            System.out.print("Telefone: ");
				            cliente.telefone = scanner.nextLine();
				            System.out.print("Endereço: ");
				            cliente.endereco = scanner.nextLine();
				            break;

				        case 2:
				            System.out.println("Opções de carros:");
				            System.out.println("1. Carro A");
				            System.out.println("2. Carro B");
				            System.out.println("3. Carro C");
				            int escolhaCarro = Integer.parseInt(scanner.nextLine());

				            switch (escolhaCarro) {
				                case 1:
				                    carro.modelo = "Carro A";
				                    break;
				                case 2:
				                    carro.modelo = "Carro B";
				                    break;
				                case 3:
				                    carro.modelo = "Carro C";
				                    break;
				                default:
				                    System.out.println("Opção inválida!");
				                    continue;
				            }

				            System.out.print("Cor do carro: ");
				            carro.cor = scanner.nextLine();
				            System.out.print("Forma de pagamento: ");
				            carro.formaDePagamento = scanner.nextLine();
				            break;

				        case 3:
				            System.out.print("Nome do acessório: ");
				            acessorio.nome = scanner.nextLine();
				            System.out.print("Quantidade: ");
				            acessorio.quantidade = Integer.parseInt(scanner.nextLine());
				            break;

				        case 4:
				            System.out.println("Saindo do programa...");
				            break;

				        default:
				            System.out.println("Opção inválida!");
				    }

				} while (opcao != 4);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
	    }
}
