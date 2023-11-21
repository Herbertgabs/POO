package ME1_Pneu;
public class AppPneu {
	public static void main(String[] args) {

		int idPneu = 01;
		String modelo = "a401";
		char estado = 'N';
	
		Pneu pneu = new Pneu(idPneu, modelo, estado);
			
		System.out.println("objeto: " + pneu + ",id: " + pneu.getIdPneu() + ", modelo: " + pneu.getModelo() + ", Indice De Vida: " + pneu.getIndiceDeVida() + ", estado: " + pneu.getEstado());
		boolean desgastar1 = pneu.desgastar(4,14);
		if(desgastar1 == true){
			System.out.println("estado: " + pneu.getEstado() + " horas de uso: " + pneu.getHorasDeUso() + " indiceDeVida: " + pneu.getIndiceDeVida());
		} else {
			System.out.println("Pneu fora de Uso");
		}
		pneu.setEstado(estado);
			
		boolean desgastar2 = pneu.desgastar(15,20);
		if(desgastar2 == true){
			System.out.println("estado: " + pneu.getEstado() + " horas de uso: " + pneu.getHorasDeUso() + " indiceDeVida: " + pneu.getIndiceDeVida());
		} else {
			System.out.println("Pneu fora de Uso");
		}
		pneu.setEstado(estado);
			
		boolean desgastar3 = pneu.desgastar(21,23);
		if(desgastar2 == true){
			System.out.println("estado: " + pneu.getEstado() + " horas de uso: " + pneu.getHorasDeUso() + " indiceDeVida: " + pneu.getIndiceDeVida());
		} else {
			System.out.println("Pneu fora de Uso");
		}
	}
}
