package ME2_Banco_Questoes;

public class QuestaoRespostaProporcional extends Questao implements IQuestao{
  private char opcaoMarcada;
  private dobule percentualA;
  private dobule percentualB;
  private dobule percentualC;

  public QuestaoRespostaProporcional(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
    this.percentualA = 0.25;
    this.percentualB = 0.5;
    this.percentualC = 1.0;
  }

  public char getOpcaoMarcada() {
    return opcaoMarcada;
  }

  @Override
  public double calcularNotaObtida() {
    if(opcaoMarcada == 'A'){
      return getNotaPadrao() * percentualA;
    }
    if(opcaoMarcada == 'B'){
      return getNotaPadrao() * percentualB;
    }
    if(opcaoMarcada == 'C'){
      return getNotaPadrao() * percentualC;
    }
  }

  public void marcaOpcao(char respostaMarcada) {
    respostaMarcada = Character.toUpperCase(respostaMarcada);
    this.opcaoMarcada = respostaMarcada;
  }
  @Override
  public String toStringQuestaoRepostaProporcional() {
    return "*** Questao de Respostas Proporcionais *** \n" + "Número: " + getIdQuestao() + "\n Enunciado" + getEnunciado() + "\n A - " + getOpcaoA() + " " + percentualA + "\n B - " + getOpcaoB() + " " + percentualB +
    "\n C - " + getOpcaoC() + percentualC + "\n Nota da Questão: " + getNotaPadrao();
  }
}