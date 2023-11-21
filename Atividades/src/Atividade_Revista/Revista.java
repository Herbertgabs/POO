package Atividade_Revista;
import java.util.ArrayList;
import java.util.List;

public class Revista {
	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List<Edicao> listaEdicoes;
	
	public Revista(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida = 0;
		this.listaEdicoes = new ArrayList <Edicao>();
	}
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}
	public void setReciclagemProduzida(int reciclagemProduzida) {
		this.reciclagemProduzida = reciclagemProduzida;
	}
	public List<Edicao> getListaEdicoes() {
		return listaEdicoes;
	}
	public void setListaEdicoes(List<Edicao> listaEdicoes) {
		this.listaEdicoes = listaEdicoes;
	}

	public void adicionaEdicao(int numeroEdicao, int triagem) {
		listaEdicoes.add(new Edicao(numeroEdicao, triagem));
	}
	
	public void removeEdicao(Edicao edicao) {
		listaEdicoes.remove(edicao);
	}
	
	public String reciclaEdicao(int numeroEdicao) {
	    for (Edicao edicao : listaEdicoes) {
	        if (edicao.getNumeroEdicao() == numeroEdicao) {
	        	if (edicao.getReciclou() == true) {
	        		return "Edição ja reciclada";
	        	}
	            if (edicao.getTiragem() < 0) {
	                return "Não houve exemplares para reciclar";

	            } else {
		        	setReciclagemProduzida(edicao.obtemReciclagem());
		        	edicao.reciclaExemplares();
	                return "Reciclagem realizada ";
	            }
	        }
	    }   
		    return "Edição não encontrada!";
	}

}
