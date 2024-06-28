package projeto_biblioteca;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList<Livro> livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<>();
	}

	public void cadastrarLivro(Livro livro){
		livros.add(livro);
		System.out.println("Livro cadastrado com sucesso!");
	}
	
	public Livro consultarLivro(String titulo) {
		for (Livro livro : livros) {
			if (livro.getTitulo().equalsIgnoreCase(titulo)) {
				return livro;
			}
		}
		return null;
	}
}