package Atividade_Consumo;
import java.util.Date;

public class Consumo {
	
	static private int ultimoId = 0;
	
	private int idConsumo;
	private Date data;
	private char tipoConsumo;
	private char tipoCliente;
	private double valorConsumo;
	private double valorConta;
	
	public Consumo(double valorConsumo) {
		ultimoId++;
		this.idConsumo = ultimoId;
		this.valorConsumo = valorConsumo;
		this.tipoCliente = 'P';
		this.tipoConsumo = 'C';
		this.data = new Date();

		fechaConta(valorConsumo);
	}
	
	public Consumo(double valorConsumo, char tipoCliente) {
		ultimoId++;
		this.idConsumo = ultimoId;
		this.valorConsumo = valorConsumo;
		this.tipoCliente = tipoCliente;
		this.tipoConsumo = 'P';
		this.data = new Date();
		
		fechaConta(valorConsumo,tipoCliente);
	}

	public int getIdConsumo() {
		return idConsumo;
	}

	public Date getData() {
		return data;
	}

	public char getTipoConsumo() {
		return tipoConsumo;
	}

	public char getTipoCliente() {
		return tipoCliente;
	}

	public double getValorConsumo() {
		return valorConsumo;
	}

	public double getValorConta() {
		return valorConta;
	}

	
	public void fechaConta(double valorConsumo) {
		final double taxaServico = valorConsumo * 0.10;
		valorConsumo += taxaServico;
		this.valorConta = valorConsumo;
	}
	
	public void fechaConta(double valorConsumo, char tipoCliente) {
		
		
		if(this.tipoCliente == 'F') {
			final double descontoFuncionario = 10.0;
			valorConsumo -= descontoFuncionario;
		}
		if(this.tipoCliente == 'A') {
			if(getValorConsumo() <= 30) {
				final double descontoAssociado = 3.0;
				valorConsumo -= descontoAssociado;

			}else {
				final double descontoAssociado = 5.0;
				valorConsumo -= descontoAssociado;

			}
		}
		else {
			final double taxaServico = valorConsumo * 0.10;
			valorConsumo += taxaServico;
			this.tipoConsumo = 'C';
		}
		this.valorConta = valorConsumo;
	}
	
	public String toString() {
		return "Consumo [idConsumo=" + idConsumo + ", data=" + data + ", tipoConsumo=" + tipoConsumo + ", tipoCliente="
				+ tipoCliente + ", valorConsumo=" + valorConsumo + ", valorConta=" + valorConta + "]";
	}
	

}
