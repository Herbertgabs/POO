package Atividade_Caminhão;

public class CaminhaoTanque extends Caminhao {
	private String tipo;

	public CaminhaoTanque(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade,
			String tipo) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, 'L');
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void encheTanque() {
		cargaAtual = getCapacidadeTotal();
	}
	public void esvaziaTanque() {
		cargaAtual = 0;
	}
	public void abasteceTanque(int qtdeLitros) {
        cargaAtual += qtdeLitros;

	}
	public  void descarregaTanque(int qtdeLitros) {
        cargaAtual -= qtdeLitros;

	}
}
