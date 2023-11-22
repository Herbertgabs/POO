package ME2_Banco_Questoes;

public class QuestaoMultiplaEscolha extends Questao implements IQuestao{
  private char opcaoCorreta;
  private char opcaoMarcada;

  public QuestaoMultiplaEscolha(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
  }

  public char getOpcaoMarcada() {
    return opcaoMarcada;
  }

  @Override
  public double calcularNotaObtida() {
    if(opcaoCorreta == opcaoMarcada){
      return getNotaPadrao();
    }
    return 0;
  }

  public void marcaOpcao(char respostaMarcada) {
    respostaMarcada = Character.toUpperCase(respostaMarcada);
    this.opcaoMarcada = respostaMarcada;
  }
 @Override
  public String toStringRespostaMultiplaEscolha() {
    return "*** Questao de Multipla Escolha *** \n" + "Número: " + getIdQuestao() + "\n Enunciado" + getEnunciado() + "\n A - " + getOpcaoA() + "\n B - " + getOpcaoB + 
    "\n C - " + getOpcaoC() + "\n Nota da Questão: " + getNotaPadrao();
  }
}