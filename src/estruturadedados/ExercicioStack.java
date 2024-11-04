package estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioStack {

	public static void main(String[] args) {
		
		   Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\n############ MENU ##############");
	            System.out.println("1- Adicionar um novo livro na pilha\n" 
	                             + "2- Listar todos os livros da Pilha\n"
	            		         +"3- Retirar um livro da pilha\n" 
	                             +"0-sair");
	            
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); // Consome a nova linha após o número

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = scanner.nextLine();
	                    pilhaLivros.push(livro);
	                    System.out.println("Livro adicionado: " + livro);
	                    break;
	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha:");
	                        for (String b : pilhaLivros) {
	                            System.out.println(b);
	                        }
	                    }
	                    break;
	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia. Não é possível retirar um livro.");
	                    } else {
	                        String livroRetirado = pilhaLivros.pop();
	                        System.out.println("Livro retirado: " + livroRetirado);
	                    }
	                    break;
	                case 0:
	                    System.out.println("Saindo do programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }

	}


