package ME1_Termostato;

public class AppTermostato {
	
	public static void main(String[] args) {
		
        Termostato termostato = new Termostato();

        termostato.ligar();
        termostato.calcularTemperatura(3, 5);
        System.out.println("Temperatura atual: " + termostato.getTemperatura());

        termostato.calcularTemperatura(2, 0);
        System.out.println("Temperatura atual: " + termostato.getTemperatura());

        termostato.ligar();
        
        termostato.calcularTemperatura(8, 2);

        termostato.desligar();
        System.out.println("Temperatura atual: " + termostato.getTemperatura());
	}
}
