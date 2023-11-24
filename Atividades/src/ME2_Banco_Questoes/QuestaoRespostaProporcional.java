package ME2_Banco_Questoes;

public class QuestaoRespostaProporcional extends Questao{
  private char opcaoMarcada;
  private double percentualA;
  private double percentualB;
  private double percentualC;

  public QuestaoRespostaProporcional(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao, double percentualA, double percentualB, double percentualC) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
    this.percentualA = percentualA;
    this.percentualB = percentualB;
    this.percentualC = percentualC;
  }

  public char getOpcaoMarcada() {
    return opcaoMarcada;
  }
  
  @Override
  public double calcularNotaObtida() {
    notaObtida = getNotaPadrao();
    if(opcaoMarcada == 'A'){
      notaObtida *= (percentualA/100);
    }
    if(opcaoMarcada == 'B'){
      notaObtida *= (percentualB/100);
    }
    if(opcaoMarcada == 'C'){
      notaObtida *= (percentualC/100);
    }
    return notaObtida;
  }

  public void marcaOpcao(char respostaMarcada) {
    this.opcaoMarcada = respostaMarcada;
  }
  @Override
  public String toString() {

    return "*** Questao de Respostas Proporcionais *** \n" + "\n Número: " + getIdQuestao() + "\n Enunciado: " + getEnunciado() + "\n A - " + getOpcaoA() 
    + " " + percentualA + "\n B - " + getOpcaoB() + " " + percentualB +
    "\n C - " + getOpcaoC() + " " + percentualC + "\n Nota da Questão: " + getNotaPadrao();
  }
}
