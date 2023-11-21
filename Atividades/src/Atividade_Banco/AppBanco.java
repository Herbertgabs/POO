package Atividade_Banco;

import java.util.Scanner;
public class AppBanco {

	static Scanner input = new Scanner(System.in);
	static Banco banco=null;
	
	public static void main(String[] args) {
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***\n");
			System.out.println("1 - Criar banco");
			System.out.println("2 - Criar conta");
			System.out.println("3 - Excluir conta");
			System.out.println("4 - Consultar Banco");
			System.out.println("5 - Listar Contas");			
			System.out.println("0 - Finalizar");
			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1: 
				criarBanco();
				break;
			case 2: 
				criarConta();
				break;
			case 3: 
				excluirConta();
				break;
			case 4: 
				consultarBanco();
				break;
			case 5: 
				listarContas();
				break;
			case 0: 
				break;
			default:
				System.out.println("Opção inválida");
			}
			if (opcao == 0) {
				break;
			}
		} while (true);
		System.out.println("Programa finalizado");
		input.close();
	}

	public static Conta pesquisarContaPorNumero(int numero) {
		for (Conta conta: banco.getContas()) {
			if (conta.getNumero()==numero) {
				return conta;
			}
		}
		return null;
	}
	
	
	
	
	public static void criarBanco() {
		if (banco != null) {
			System.out.println("--- Banco já criado ---");
			return;
		}
		System.out.println("\n*** Cadastro de Banco ***\n");
		System.out.print("Número do banco: ");
		int numeroBanco = input.nextInt();
		System.out.print("Nome: ");
		input.nextLine();
		String nomeBanco = input.nextLine();
		
		banco = new Banco(numeroBanco, nomeBanco);
		System.out.println("\n--- Banco Cadastrado ---\n");
	}

	public static void criarConta() {
		if (banco==null) {
			System.out.println("Banco ainda não criado");
			return;
		}
		System.out.println("\n*** Cadastro de Conta ***\n");
		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();
		System.out.println("Dígito: ");
		int digitoConta = input.nextInt();
		banco.abreConta(numeroConta, digitoConta);
		System.out.println("--- Conta Criada ---");
	}

	public static void excluirConta() {
		if (banco==null) {
			System.out.println("Banco ainda não criado");
			return;
		}
		if (banco.getContas().size()==0) {
			System.out.println("Nenhuma conta foi criada");
			return;			
		}
		System.out.println("\n*** Exclusão de Conta ***\n");
		System.out.println("Número da conta: ");
		int numeroConta = input.nextInt();
		Conta contaEncontrada = pesquisarContaPorNumero(numeroConta);
		if ( contaEncontrada == null) {
			System.out.println("Conta não cadastrada");
			return;
		}
		banco.getContas().remove(contaEncontrada);
		System.out.println("--- Conta Excluída ---");
	}

	public static void consultarBanco() {
		if (banco==null) {
			System.out.println("Banco ainda não criado");
			return;
		}		System.out.println("\n*** Consultar Banco ***\n");
		System.out.println("Número do banco: " + banco.getNumero());
		System.out.println("Nome do banco  : " + banco.getNome());
	}
	
	public static void listarContas() {
		if (banco==null) {
			System.out.println("Banco ainda não criado");
			return;
		}		System.out.println("\n*** Listagem de Contas ***\n");
		for (Conta conta: banco.getContas()) {
			System.out.printf("%d - %d - %.2f\n", conta.getNumero(),
					conta.getDigito(), conta.getSaldo());
		}
	}


}

