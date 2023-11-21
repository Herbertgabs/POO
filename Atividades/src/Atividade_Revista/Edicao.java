package Atividade_Revista;
import java.util.Date;

public class Edicao {
	private int numeroEdicao;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;
	
	public Edicao(int numeroEdicao, int tiragem) {
		this.numeroEdicao = numeroEdicao;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = 0;
		this.reciclou = false;
	}
	
	public int getNumeroEdicao() {
		return numeroEdicao;
	}
	public Date getData() {
		return data;
	}
	public int getTiragem() {
		return tiragem;
	}
	public int getQtdeVendida() {
		return qtdeVendida;
	}
	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}
	public boolean getReciclou() {
		return reciclou;
	}
	public void setReciclou(boolean reciclou) {
		this.reciclou = reciclou;
	}
	public void informaVenda(int qtdeVendida) {
		setQtdeVendida(qtdeVendida);
	}
	public int obtemReciclagem(){
		return tiragem - getQtdeVendida();
	}
	public void reciclaExemplares() {
		setReciclou(true);
	}
}
