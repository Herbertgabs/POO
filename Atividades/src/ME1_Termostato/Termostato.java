package ME1_Termostato;

public class Termostato {
	
	private boolean estado;
	private double temperatura;
	
	public Termostato() {
		this.estado = false;
		temperatura = 0;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public void ligar() {
		estado = true;
		temperatura = 80;
	}
	public void desligar() {
		estado = false;
	}
	public void calcularTemperatura(int incrementar, int decrementar) {
		if(estado == true) {
			temperatura = Math.min(temperatura + incrementar, 85);
			temperatura = Math.max(temperatura - decrementar, 80);
		}
	}
}
