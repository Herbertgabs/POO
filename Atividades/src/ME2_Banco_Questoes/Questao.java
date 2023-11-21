package ME2_Banco_Questoes;

public abstract class Questao implements IQuestao{
  private int idQuestao;
  private String enunciado;
  private String opcaoA;
  private String opcaoB;
  private String opcaoC;
  private double notaPadrao;
  protected double notaObtida;

  public Questao(int idQuestao, String enunciado, String opcaoA, String opcaoB, String opcaoC, double notaPadrao) {
    this.idQuestao = idQuestao;
    this.enunciado = enunciado;
    this.opcaoA = opcaoA;
    this.opcaoB = opcaoB;
    this.opcaoC = opcaoC;
    this.notaPadrao = notaPadrao;
    this.notaObtida = 0;
  }

  public String getEnunciado() {
    return enunciado;
  }

  public String getOpcaoA() {
    return opcaoA;
  }

  public String getOpcaoB() {
    return opcaoB;
  }

  public String getOpcaoC() {
    return opcaoC;
  }
  

}