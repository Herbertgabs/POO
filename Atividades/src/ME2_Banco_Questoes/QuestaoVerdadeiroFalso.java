package ME2_Banco_Questoes;
public class QuestaoVerdadeiroFalso extends Questao implements IQuestao{
  private char respostaCorretaA;
  private char respostaCorretaB;
  private char respostaCorretaC;
  private char respostaMarcadaA;
  private char respostaMarcadaB;
  private char respostaMarcadaC;

  public QuestaoVerdadeiroFalso(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
  }

  @Override
  public double calcularNotaObtida() {
    double nota = getNotaPadrao();
    if (respostaMarcadaA == respostaCorretaA) {
      nota += getNotaPadrao();
    }
    if (respostaMarcadaB == respostaCorretaB) {
      nota += getNotaPadrao();
    }
    if (respostaMarcadaC == respostaCorretaC) {
      nota += getNotaPadrao();
    }
    return nota;
  }

  public void marcaOpcao(char opcao, char respostaMarcada) {
    respostaMarcada = Character.toUpperCase(respostaMarcada);
    respostaMarcada = Character.toUpperCase(opcao);
    if(opcao == 'A'){
      this.respostaMarcadaA = respostaMarcada;
    }
    if(opcao == 'B'){
      this.respostaMarcadaB = respostaMarcada;
    }
    if(opcao == 'C'){
      this.respostaMarcadaC = respostaMarcada;
    }
  }

  @Override
  public String toString() {
    return "*** Questao de Verdadeiro ou Falso ***" + "\n Número: " + getIdQuestao() + "\n Enunciado" + getEnunciado() + "\n A - " + getOpcaoA() + " " + respostaMarcadaA + "\n B - " + getOpcaoB() + " " + respostaMarcadaB + " " +
    "\n C - " + getOpcaoC() + " " + respostaMarcadaC + "\n Nota da Questão: " + getNotaPadrao();
  }
}