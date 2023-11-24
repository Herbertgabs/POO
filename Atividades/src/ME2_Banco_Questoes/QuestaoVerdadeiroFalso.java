package ME2_Banco_Questoes;
public class QuestaoVerdadeiroFalso extends Questao{
  private char respostaCorretaA;
  private char respostaCorretaB;
  private char respostaCorretaC;
  private char respostaMarcadaA;
  private char respostaMarcadaB;
  private char respostaMarcadaC;

  public QuestaoVerdadeiroFalso(String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao, char respostaCorretaA, char respostaCorretaB, char respostaCorretaC) {
    super(enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
    this.respostaCorretaA = respostaCorretaA;
    this.respostaCorretaB = respostaCorretaB;
    this.respostaCorretaC = respostaCorretaC;
    notaObtida = 0;
  }
  @Override
  public double calcularNotaObtida() {
    double notaPadrao = getNotaPadrao() * (1.0 / 3);
    if (respostaMarcadaA == respostaCorretaA) {
      notaObtida += notaPadrao;
    }
    if (respostaMarcadaB == respostaCorretaB) {
      notaObtida += notaPadrao;
    }
    if (respostaMarcadaC == respostaCorretaC) {
      notaObtida += notaPadrao;
    }
    return notaObtida;
  }

  public void marcaOpcao(char opcao, char respostaMarcada) {
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
    return "*** Questao de Verdadeiro ou Falso *** \n" + "\n Número: " + getIdQuestao() + "\n Enunciado: " + getEnunciado() + "\n A - " + getOpcaoA() + " " + respostaCorretaA + "\n B - " + getOpcaoB() + " " + respostaCorretaB + " " +
    "\n C - " + getOpcaoC() + " " + respostaCorretaC + "\n Nota da Questão: " + getNotaPadrao();
  }
}
