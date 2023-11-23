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

		if(questaoME != null){
			System.out.println("Questão ME já criada!");
			return;
		}

		System.out.println("*** Cadastro de Questão de Multipla Escolha ***");
		System.out.print("Insira enunciado da questão:");
		String enunciado = input.nextLine();

		enunciado = input.nextLine();

		System.out.print("Insira opção A:");
		String opcaoA = input.nextLine();

		System.out.print("Insira opção B:");
		String opcaoB = input.nextLine();

		System.out.print("Insira opção C:");
		String opcaoC = input.nextLine();
	
		System.out.print("Insira valor padrão da questão:");
		int valorPadrao = input.nextInt();

		System.out.print("Insira a questão correta (A, B ou C):");
		char questaoCorreta = input.next().charAt(0);
        questaoCorreta = Character.toUpperCase(questaoCorreta);

		questaoME = new QuestaoMultiplaEscolha(enunciado, opcaoA, opcaoB, opcaoC, valorPadrao, questaoCorreta);

		System.out.println(questaoME.toString());
		return;
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

		if(questaoVF != null){
			System.out.println("Questão VF já criada!");
			return;
		}

		System.out.println("*** Cadastro de Questão de Verdadeiro ou Falso ***");
		System.out.print("Insira enunciado da questão:");
		String enunciado = input.nextLine();

		enunciado = input.nextLine();

		System.out.print("Insira opção A:");
		String opcaoA = input.nextLine();

		System.out.print("Insira opção B:");
		String opcaoB = input.nextLine();

		System.out.print("Insira opção C:");
		String opcaoC = input.nextLine();
	
		System.out.print("Insira valor padrão da questão:");
		int valorPadrao = input.nextInt();

		System.out.print("Insira se a questão A é Verdadeira ou Falsa (V ou F):");
		char questaoCorretaA = input.next().charAt(0);
        questaoCorretaA = Character.toUpperCase(questaoCorretaA);
		if(questaoCorretaA != 'V' && questaoCorretaA != 'F' ){
			System.out.println("Resposta Invalida! A resposta só pode ser Verdadeira ou Falsa (V ou F)");
			return;
		}
		System.out.print("Insira se a questão B é Verdadeira ou Falsa (V ou F):");
		char questaoCorretaB = input.next().charAt(0);
        questaoCorretaB = Character.toUpperCase(questaoCorretaB);
		if(questaoCorretaB != 'V' && questaoCorretaB != 'F' ){
			System.out.println("Resposta Invalida! A resposta só pode ser Verdadeira ou Falsa (V ou F)");
			return;
		}

		System.out.print("Insira se a questão C é Verdadeira ou Falsa (V ou F):");
		char questaoCorretaC = input.next().charAt(0);
        questaoCorretaC = Character.toUpperCase(questaoCorretaC);
		if(questaoCorretaC != 'V' && questaoCorretaC != 'F' ){
			System.out.println("Resposta Invalida! A resposta só pode ser Verdadeira ou Falsa (V ou F)");
			return;
		}

		questaoVF = new QuestaoVerdadeiroFalso(enunciado, opcaoA, opcaoB, opcaoC, valorPadrao, questaoCorretaA, questaoCorretaB, questaoCorretaC);

		System.out.println(questaoVF.toString());
		return;
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
		if(questaoRP != null){
			System.out.println("Questão RP já criada!");
			return;
		}

		System.out.println("*** Cadastro de Questão de Respostas Proporcionais ***");
		System.out.print("Insira enunciado da questão:");
		String enunciado = input.nextLine();

		enunciado = input.nextLine();

		System.out.print("Insira opção A:");
		String opcaoA = input.nextLine();

		System.out.print("Insira opção B:");
		String opcaoB = input.nextLine();

		System.out.print("Insira opção C:");
		String opcaoC = input.nextLine();
	
		System.out.print("Insira valor padrão da questão:");
		int valorPadrao = input.nextInt();
		

		System.out.print("Insira percentual da questão A (100, 50 ou 25):");
		double percentualA = input.nextDouble();
		
		System.out.print("Insira percentual da questão B (100, 50 ou 25):");
		double percentualB = input.nextDouble();

		System.out.print("Insira percentual da questão A (100, 50 ou 25):");
		double percentualC = input.nextDouble();

		questaoRP = new QuestaoRespostaProporcional(enunciado, opcaoA, opcaoB, opcaoC, valorPadrao, percentualA, percentualB, percentualC);

		System.out.println(questaoRP.toString());
		return;
	}
	
	public static void responderQuestaoME() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a opção considera como correta
		 Marca a questão
		 Calcular e mostrar a nota obtida.
		*/
		if(questaoME == null){
		System.out.println("Nenhuma questão ME encontrada!");
		return;
		}
		System.out.println("Id da Questão: " + questaoME.getIdQuestao());
		System.out.println("Enunciado: " + questaoME.getEnunciado());
		System.out.println("A - " +questaoME.getOpcaoA());
		System.out.println("B - " +questaoME.getOpcaoB());
		System.out.println("C - " +questaoME.getOpcaoC());

		System.out.println("Insira sua resposta: (A, B ou C)");
		char questaoMarcada = input.next().charAt(0);
        questaoMarcada = Character.toUpperCase(questaoMarcada);
		if(questaoMarcada != 'A' && questaoMarcada !=  'B' && questaoMarcada !=  'C'){
			System.out.println("Insira sua resposta é invalida!");
			return;
		}
		else{
			
			questaoME.marcaOpcao(questaoMarcada);
			questaoME.calcularNotaObtida();
			System.out.printf("Nota: %.2f", questaoME.getNotaObtida());

		}
	}	

	public static void responderQuestaoVF() {
		/*
		Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		Mostrar a questão
		Receber apenas as letras V ou F para cada opção
		Marca a questão
		Calcular e mostrar a nota obtida.
		*/
		if (questaoVF == null) {
			System.out.println("Nenhuma questão VF encontrada!");
			return;
		}
	
		System.out.println("Id da Questão: " + questaoVF.getIdQuestao());
		System.out.println("Enunciado: " + questaoVF.getEnunciado());
		System.out.println("A - " + questaoVF.getOpcaoA());
		System.out.println("B - " + questaoVF.getOpcaoB());
		System.out.println("C - " + questaoVF.getOpcaoC());
	
		System.out.print("Insira sua resposta da letra A (V ou F):");
		char questaoMarcadaA = input.next().charAt(0);
		questaoMarcadaA = Character.toUpperCase(questaoMarcadaA);
		if (questaoMarcadaA != 'V' && questaoMarcadaA != 'F') {
			System.out.println("Erro");
			return;
		}

		questaoVF.marcaOpcao('A', questaoMarcadaA);

		System.out.print("Insira sua resposta da letra B (V ou F):");
		char questaoMarcadaB = input.next().charAt(0);
		questaoMarcadaB = Character.toUpperCase(questaoMarcadaB);
		if (questaoMarcadaB != 'V' && questaoMarcadaB != 'F') {
			System.out.println("Erro");
			return;
		}

		questaoVF.marcaOpcao('B', questaoMarcadaB);


		System.out.print("Insira sua resposta da letra C (V ou F):");
		char questaoMarcadaC = input.next().charAt(0);
		questaoMarcadaC = Character.toUpperCase(questaoMarcadaC);
		if (questaoMarcadaC != 'V' && questaoMarcadaC != 'F') {
			System.out.println("Erro");
		}
	
		questaoVF.marcaOpcao('C', questaoMarcadaC);
		questaoVF.calcularNotaObtida();

		System.out.printf("Nota: %.2f", questaoVF.getNotaObtida());
	}
	

	public static void responderQuestaoRP() {
		/*
		 Criticar se a questão já foi criada. Se não, informar e retornar ao menu.
		 Mostrar a questão
		 Receber apenas as letras A, B ou C correspondente a opção considera como correta
		 Marca a questão
		 Calcular e mostrar a nota obtida.
		*/
		if(questaoRP == null){
			System.out.println("Nenhuma questão RP encontrada!");
			return;
		}
		System.out.println("Id da Questão: " + questaoRP.getIdQuestao());
		System.out.println("Enunciado: " + questaoRP.getEnunciado());
		System.out.println(" A - " + questaoRP.getOpcaoA());
		System.out.println(" B - " + questaoRP.getOpcaoB());
		System.out.println(" C - " + questaoRP.getOpcaoC());

		System.out.println("Insira sua resposta (A, B ou C):");
		char questaoMarcada = input.next().charAt(0);
        questaoMarcada = Character.toUpperCase(questaoMarcada);

		if(questaoMarcada != 'A' && questaoMarcada !=  'B' && questaoMarcada !=  'C'){
			System.out.println("Sua resposta é invalida!");
			return;
		}
		else{
			questaoRP.marcaOpcao(questaoMarcada);
			}
		questaoRP.calcularNotaObtida();
		System.out.printf("Nota: %.2f", questaoRP.getNotaObtida());
		} 
	}