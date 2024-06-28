package projeto_biblioteca;

public class Livro {
	
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String codigoISBN;
	
	public Livro(String titulo, String autorLivro, int anoPublicacao, String codigoISBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.codigoISBN = codigoISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(String codigoISBN) {
		this.codigoISBN = codigoISBN;
	}
	
}
