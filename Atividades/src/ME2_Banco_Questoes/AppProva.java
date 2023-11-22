package ME2_Banco_Questoes;
import java.util.Scanner;
public class AppProva {
	static Scanner input = new Scanner(System.in);
	static QuestaoMultiplaEscolha questaoME = null;
	static QuestaoVerdadeiroFalso questaoVF = null;
  	static QuestaoRespostaProporcional questaoRP = null;
	public static void main(String[] args) {
		
		int opcao = 0;
		do {
			System.out.println("\n*** Seletor de Opções ***\n");
			System.out.println("1 - Criar questão de múltipla escolha");
			System.out.println("2 - Criar questão de verdadeiro ou falso");
			System.out.println("3 - Criar questão de resposta proporcional");
			System.out.println("4 - Responder a questão de múltipla escolha");
			System.out.println("5 - Responder a questão de verdadeiro ou falso");
			System.out.println("6 - Responder a questão de resposta proporcional");			
			System.out.println("0 - Finalizar");
			System.out.print("\nOpção: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 1: 
				criarQuestaoME();
				break;
			case 2: 
				criarQuestaoVF();
				break;
			case 3: 
				criarQuestaoRP();
				break;
			case 4: 
				responderQuestaoME();
				break;
			case 5: 
				responderQuestaoVF();
				break;
			case 6: 
				responderQuestaoRP();
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
	
	public static void criarQuestaoME() {
		/*
		 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
		 Receber o texto do enunciado
		 Receber os textos das 3 opções
		 Receber a letra da opção correta
		 Receber a nota padrão. Tratar as exceções possíveis
		 Instancia o objeto QuestaoME. Tratar a exceção criada.
		 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
		*/
	}
	
	public static void criarQuestaoVF() {
		/*
		 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
		 Receber o texto do enunciado
		 Receber os textos das 3 opções com a resposta correta de cada uma das opções
		 Receber a nota padrão. Tratar as exceções possíveis
		 Instancia o objeto QuestaoVF. Tratar a exceção criada.
		 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
		*/
	}

	public static void criarQuestaoRP() {
		/*
		 Criticar se a questão já foi criada. Se sim, informar e retornar ao menu.
		 Receber o texto do enunciado
		 Receber os textos das 3 opções com o percentual de cada uma das opções
		 Receber a nota padrão. Tratar as exceções possíveis
		 Instancia o objeto QuestaoRP. Tratar a exceção criada.
		 Se o objeto foi instanciado, mostrar os dados da questão, conforme modelo do enunciado.
		*/
	}
	
	public static void responderQuestaoME() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a opção considera como correta
		 Marca a questão
		 Calcular e mostrar a nota obtida.
		*/
	}	

	public static void responderQuestaoVF() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras V ou F para cada opção
		 Marca a questão
		 Calcular e mostrar a nota obtida.
		*/
	}	

	public static void responderQuestaoRP() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a opção considera como correta
		 Marca a questão
		 Calcular e mostrar a nota obtida.
		*/
	}	
	
}