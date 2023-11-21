package Atividade_Caminhão;

public abstract class Caminhao {
	private int nrCaminhao;
	private String modelo;
	private int anoFabricacao;
	private int capacidadeTotal;
	protected float cargaAtual;
	private char unidade;
	
	public Caminhao(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal,
			char unidade) {
		this.nrCaminhao = nrCaminhao;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.capacidadeTotal = capacidadeTotal;
		this.unidade = unidade;
	}

	public int getNrCaminhao() {
		return nrCaminhao;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public float getCargaAtual() {
		return cargaAtual;
	}

	public void setCargaAtual(float cargaAtual) {
		this.cargaAtual = cargaAtual;
	}

	public char getUnidade() {
		return unidade;
	}

	public void setUnidade(char unidade) {
		this.unidade = unidade;
	}
}
