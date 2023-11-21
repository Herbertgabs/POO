package ME1_Pneu;

public class Pneu {
	private int idPneu;
	private String modelo;
	private double indiceDeVida;
	private char estado;
	private int horasDeUso;
	
	public Pneu(int idPneu,String modelo,char estado){
	this.idPneu = idPneu;
	this.modelo = modelo;
	this.indiceDeVida = 110;
	this.estado = estado;
	this.horasDeUso = 0;
	}
	public int getIdPneu() {
		return idPneu;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getIndiceDeVida() {
		return indiceDeVida;
	}
	public void setIndiceDeVida(double indiceDeVida) {
		this.indiceDeVida = indiceDeVida;
	}
	public char getEstado() {
		return estado;
	}
	public void setEstado(char estado) {
		this.estado = estado;
	}
	public int getHorasDeUso() {
		return horasDeUso;
	}
	public void setHorasDeUso(int horasDeUso) {
		this.horasDeUso = horasDeUso;
	}
	
	public boolean desgastar(int horaInicial, int horaFinal){
		if(estado == 'N' || estado == 'U'){
			if(estado == 'N') {
				estado = 'U';
			}
			horasDeUso = horaFinal - horaInicial;
			double minutosDeUso = horasDeUso * 60;
			double indiceDeUso = minutosDeUso * 0.12345;
			indiceDeUso -= indiceDeVida;
			if(indiceDeUso <= 0) {
				estado = 'F'; 
			}
			return true;
		}
		else {
			return false;
		}
	}
	
}
