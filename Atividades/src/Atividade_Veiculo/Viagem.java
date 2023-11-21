package Atividade_Veiculo;
import java.util.Date;
public class Viagem {
	private int idViagem;
	private String destino;
	private Date dataInicial;
	private Date dataFinal;
	private int kmPercorrido;
	private Veiculo veiculo;
	
	public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal) {
		this.idViagem = idViagem;
		this.destino = destino;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.kmPercorrido = 0;
		}
	
	public int getIdViagem() {
		return idViagem;
		}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public Date getDataInicial() {
		return dataInicial;
	}
	
	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}
	
	public Date getDataFinal() {
		return dataFinal;
	}
	
	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}
	
	public int getKmPercorrido() {
		return kmPercorrido;
	}
	
	public void setKmPercorrido(int kmPercorrido) {
		this.kmPercorrido = kmPercorrido;
	}

	public boolean iniciarViagem(Veiculo veiculo){
		this.veiculo = veiculo;
		if(veiculo.getStatus() == 'D') {
			this.veiculo = veiculo;
			dataInicial = new Date();
			veiculo.registrarViagem();
			return true;
		}
		else {
			return false;
		}
	}

	public void finalizarViagem (int kmOdometro) {
		dataFinal = new Date();
		setKmPercorrido(calcularKmPercorrido(kmOdometro));
		veiculo.registrarRetorno(kmOdometro);
		
	}
	public int calcularKmPercorrido(int kmOdometro) {
		return kmOdometro - veiculo.getKmOdometro();
	}
}
