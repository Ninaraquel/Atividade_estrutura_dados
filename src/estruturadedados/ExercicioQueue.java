package estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();

		int opcao = 0;

		do {
			System.out.println("\n############ MENU ############");
			System.out.println("1 - Adicionar cliente na fila\n" 
			                 + "2 - Listar todos os clientes\n"
					         + "3 - Retirar cliente da fila\n"
			                 + "0 - Sair");

			System.out.print("Digite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // Consumir o "\n" depois do número

			if (opcao == 1) {

				System.out.print("\nDigite o nome: ");
				String nome = scanner.nextLine();
				
				fila.add(nome);
				System.out.println("\nFila:\n" + fila + "\nCliente Adicionado!\n");

			} else if (opcao == 2) {
				System.out.println("\nLista de Clientes na Fila:");
				
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia!\n");
				} else {
					for (String cliente : fila) {
						System.out.println(cliente);
					}
					System.out.println();
				}

			} else if (opcao == 3) {
				
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!\n");
				} else {
					String chamado = fila.poll();
					System.out.println("\nO Cliente foi Chamado: " + chamado);
					System.out.println("Fila:\n" + fila + "\n");
				}

			} else if (opcao == 0) {
				System.out.println("\nPrograma Finalizado!");

			} else {
				System.out.println("\nOpção inválida! Tente novamente.");
			}
		}while (opcao != 0 );

		scanner.close();
	}

}
