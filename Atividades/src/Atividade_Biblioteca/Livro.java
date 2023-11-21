package Atividade_Biblioteca;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	
	public Livro (int idLivro, String titulo, String ISBN, int numeroPaginas) {
		
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.numeroPaginas = numeroPaginas;
		
	}
	
	public int getIdLivro() {
		return idLivro;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
	
	
	
}
