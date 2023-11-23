package ME2_Banco_Questoes;

public class QuestaoMultiplaEscolha extends Questao{
  private char opcaoCorreta;
  private char opcaoMarcada;

  public QuestaoMultiplaEscolha(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao,char opcaoCorreta) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
    this.opcaoCorreta = opcaoCorreta;
    notaObtida = 0;
  }

  public char getOpcaoCorreta() {
    return opcaoCorreta;
  }

  public char getOpcaoMarcada() {
    return opcaoMarcada;
  }

  @Override
  public double calcularNotaObtida() {
    notaObtida = 0;
    if(opcaoMarcada == opcaoCorreta){
      notaObtida = getNotaPadrao();
    }
    return notaObtida;
  }

  public void marcaOpcao(char respostaMarcada) {
    this.opcaoMarcada = respostaMarcada;
  }
  
  public String toString() {
    if(opcaoCorreta == 'A'){
      return "*** Questao de Multipla Escolha *** \n" + "\n Número: " + getIdQuestao() + "\n Enunciado: " + getEnunciado() + "\n A - " + getOpcaoA() + " Correta " + "\n B - " + getOpcaoB() + 
      "\n C - " + getOpcaoC() + "\n Nota da Questão: " + getNotaPadrao();
    }
    if(opcaoCorreta == 'B'){
      return "*** Questao de Multipla Escolha *** \n" + "\n Número: " + getIdQuestao() + "\n Enunciado: " + getEnunciado() + "\n A - " + getOpcaoA() + "\n B - " + getOpcaoB() + " Correta " +
      "\n C - " + getOpcaoC() + "\n Nota da Questão: " + getNotaPadrao();
    }
    if(opcaoCorreta == 'C'){
      return "*** Questao de Multipla Escolha *** \n" + "\n Número: " + getIdQuestao() + "\n Enunciado: " + getEnunciado() + "\n A - " + getOpcaoA() + "\n B - " + getOpcaoB() + 
      "\n C - " + getOpcaoC() + " Correta " + "\n Nota da Questão: " + getNotaPadrao();
    }
    return "Error";
  }
}