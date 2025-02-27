package projeto_biblioteca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Biblioteca biblioteca = new Biblioteca();
		
		while (true) {	
			System.out.println("Você deseja cadastrar ou realizar uma consulta?");
			System.out.println("1. Cadastrar");
			System.out.println("2. Consultar");
			System.out.println("3. Sair");
			int opcao = sc.nextInt();
			sc.nextLine();
		
			if (opcao == 1) {
				System.out.println("Quantos livros serão cadastrados?");
				int n = sc.nextInt();
				sc.nextLine();
			
				for (int i=0; i<n; i++) {
					System.out.println("Digite o título do livro: ");
					String titulo = sc.nextLine();
					System.out.println("Digite o autor do livro: ");
					String autor = sc.nextLine();
					System.out.println("Digite o ano da publicação do livro: ");
					int ano = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o código ISBN do livro: ");
					String isbn = sc.nextLine();
				
				Livro liv = new Livro(titulo, autor, ano, isbn);
				biblioteca.cadastrarLivro(liv);
			} 
				
		}else if (opcao == 2) {
			System.out.println("Digite o título do livro para consulta: ");
			String titulo = sc.nextLine();
			Livro livro = biblioteca.consultarLivro(titulo);
			if (livro != null) {
				System.out.println("Livro encontrado:");
				System.out.println("Título: " + livro.getTitulo());
				System.out.println("Autor: " + livro.getAutor());
				System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
				System.out.println("ISBN: " + livro.getCodigoISBN());
			}else {
				System.out.println("Desculpe, esse livro não existe em nossa biblioteca!");
			}
		} else if (opcao == 3) {
				System.out.println("Saindo do sistema...");
				break;
		} else {
			System.out.println("Opção inválida! Tente novamente.");
		}
	}
		
		sc.close();
	}
}