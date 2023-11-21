package Atividade_Veiculo;
import java.util.Scanner;
import java.util.Date;
public class App {
	static Scanner input = new Scanner(System.in);
	static Veiculo veiculo = null;
	static Viagem viagem = null;
	public static void main(String[] args) {
		int opcao = 0;
		
		do {
			System.out.println("\n --- Opcoes --- \n");
			System.out.println("1- Cadastrar veiculo");
			System.out.println("2- Consultar veiculo");
			System.out.println("3- Programar viagem");
			System.out.println("4- Consultar viagem");
			System.out.println("5- Iniciar viagem");
			System.out.println("6- Finalizar viagem");
			System.out.println("7- Colocar veiculo em manutencao");
			System.out.println("0- Finalizar");
			opcao = input.nextInt();
			switch (opcao) {
				case 1:
					cadastrarVeiculo();
					break;
				case 2:
					consultarVeiculo();
					break;
				case 3:
					programarViagem();
					break;
				case 4:
					consultarViagem();
					break;
				case 5:
					iniciarViagem();
					break;
				case 6:
					finalizarViagem();
					break;
				case 7:
					veiculoManutencao();
					break;
				case 0:
					break;
				default:
					System.out.println("Opcao invalida!");	
			}
		}	
		while (opcao != 0);
			System.out.println("Programa Finalizado");
			input.close();
	}
	public static void cadastrarVeiculo(){
		if(veiculo != null) {
			System.out.println("Veiculo já cadastrado");
			return;
		}
		System.out.println("\n --- Cadastro de Veiculo --- \n");
		System.out.print("Id Veiculo:");
		int idVeiculo = input.nextInt();
		input.nextLine();
		
		System.out.print("Placa do veiculo:");
		String placa = input.nextLine();
		
		System.out.print("Odometro:");
		int kmOdometro = input.nextInt();
		
		veiculo = new Veiculo(idVeiculo, placa, kmOdometro);
	}
	public static void consultarVeiculo() {
		if (veiculo == null) {
			System.out.println("Nenhum veiculo cadastrado");
			return;
		}
		System.out.println("\n --- Consultar Veiculo --- \n");
		System.out.print("Insira o ID:");
		int idVeiculo = input.nextInt();
		if(idVeiculo == veiculo.getIdVeiculo()) {
			System.out.println("Id do Veiculo: " + veiculo.getIdVeiculo());
			System.out.println("Placa: " + veiculo.getPlaca());
			System.out.println("Odometro: " + veiculo.getKmOdometro());
		}
		else{
			System.out.println("ID não encontrado!");
		}
	}
	public static void programarViagem() {
		
		System.out.println("\n --- Programar Viagem --- \n");
		System.out.println("Insira o ID:");
		int idViagem = input.nextInt();
		input.nextLine();
		System.out.println("Insira destino:");
		String destino = input.nextLine();
		// obs: não sei como dar input em Date
		//System.out.println("Insira a data inicial: "); 
        Date dataInicial = new Date(); 
		//System.out.println("Insira a data final: ");
        Date dataFinal = new Date();	
		viagem = new Viagem(idViagem, destino, dataInicial, dataFinal);
	}
	public static void consultarViagem(){
		if(viagem == null) {
			System.out.println("Não tem viagem programada");
			return;
		}
		System.out.println("\n --- Consultar Viagem --- \n");
		System.out.print("Insira ID da Viagem:");
		int idViagem = input.nextInt();
		if(idViagem == viagem.getIdViagem()) {
			System.out.println("Id da viagem: " + viagem.getIdViagem());
			System.out.println("Placa: " + viagem.getDestino());
			System.out.println("Data Inicial: " + viagem.getDataInicial());
			System.out.println("Data Final: " + viagem.getDataFinal());

		} 
		else{
			System.out.println("ID não encontrado!");
		}
		
	}
	public static boolean iniciarViagem() {
		if(viagem == null) {
			System.out.println("Não tem viagem programada");
			return false;
		}
		if(veiculo == null) {
			System.out.println("Não tem veiculo cadastrado");
			return false;
		}
		viagem.iniciarViagem(veiculo);
		System.out.println("Viagem Iniciada! (estado " + veiculo.getStatus() + ") ");
		return true;
	}
	public static void finalizarViagem() {
		if(viagem == null) {
			System.out.println("Não tem viagem programada");
			return;
		}
		if(iniciarViagem() == false) {
			System.out.println("Viagem não iniciada");
			return;
		}
		System.out.print("Insira quantos km percorrido marcado pelo odometro: ");
		int kmOdometro = input.nextInt();
		viagem.finalizarViagem(kmOdometro);
		System.out.println("dataFinal:" + viagem.getDataFinal());
		System.out.println("Total KM percorridos" + viagem.getKmPercorrido());
		System.out.println("Viagem finalizada! (estado " + veiculo.getStatus() + ") ");
	}
	public static void veiculoManutencao() {
		if(veiculo == null) {
			System.out.println("Não tem veiculo cadastrado");
			return;
		}
		veiculo.revisar();
		System.out.println("Veiculo enviado para manutencao (estado: " + veiculo.getStatus() + ")");
	}
}
