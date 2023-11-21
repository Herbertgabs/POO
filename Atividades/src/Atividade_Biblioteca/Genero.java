package Atividade_Biblioteca;

public class Genero {
	private int idGenero;
	private String nomeGenero;
	public Genero (int idGenero, String nomeGenero) {
		this.idGenero = idGenero;
		this.nomeGenero = nomeGenero;
	}
	
	public int getIdGenero() {
		return idGenero;
	}

	public String getNomeGenero() {
		return nomeGenero;
	}
	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}
}
