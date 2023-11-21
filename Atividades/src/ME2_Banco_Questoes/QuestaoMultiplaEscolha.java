package ME2_Banco_Questoes;

public class QuestaoMultiplaEscolha extends Questao implements IQuestao{
  private char opcaoCorreta;
  private char opcaoMarcada;

  public QuestaoMultiplaEscolha(int idQuestao, String enunciado, String opcaoA, String opcaoB, String opcaoC,
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