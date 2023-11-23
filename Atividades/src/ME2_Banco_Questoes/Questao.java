package ME2_Banco_Questoes;

public abstract class Questao implements IQuestao{
  static private int ultimoId=0;

  private int idQuestao;
  private String enunciado;
  private String opcaoA;
  private String opcaoB;
  private String opcaoC;
  private double notaPadrao;
  protected double notaObtida;

  public Questao(String enunciado, String opcaoA, String opcaoB, String opcaoC, double notaPadrao) {
    ultimoId++;
    this.idQuestao = ultimoId;
    this.enunciado = enunciado;
    this.opcaoA = opcaoA;
    this.opcaoB = opcaoB;
    this.opcaoC = opcaoC;
    this.notaPadrao = notaPadrao;
  }

  public int getIdQuestao() {
    return idQuestao;
  }

  public double getNotaPadrao() {
    return notaPadrao;
  }

  public double getNotaObtida() {
    return notaObtida;
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