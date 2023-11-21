package ME2_Banco_Questoes;

public class QuestaoRespostaProporcional extends Questao implements IQuestao{
  private char respotaCorretaA;
  private char respotaCorretaB;
  private char respotaCorretaC;
  private char respotaMarcadaA;
  private char respotaMarcadaB;
  private char respotaMarcadaC;

  public QuestaoRespostaProporcional(int idQuestao, String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao) {
    super(idQuestao, enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
  }

  @Override
  public double calcularNotaObtida() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void marcaOpcao(char respostaMarcada) {
    // TODO Auto-generated method stub
    
  }
}