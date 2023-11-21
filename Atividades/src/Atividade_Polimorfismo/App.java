package Atividade_Polimorfismo;

public class App {
	public static void main (String[] args) {
		
		Consumo consumo1 = new Consumo(35.00);
		
		System.out.println(consumo1.toString());
		
		Consumo consumo2 = new Consumo(25.00, 'F');
		
		System.out.println(consumo2.toString());

		
		Consumo consumo3 = new Consumo(23.00, 'A');

		System.out.println(consumo3.toString());

		
		Consumo consumo4 = new Consumo(35.00, 'A');
		
		System.out.println(consumo4.toString());

	}
}
