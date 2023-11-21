package ME2_Banco_Questoes;

public class QuestaoVerdadeiroFalso extends Questao implements IQuestao{
  private char respostaCorretaA;
  private char respostaCorretaB;
  private char respostaCorretaC;
  private char respostaMarcadaA;
  private char respostaMarcadaB;
  private char respostaMarcadaC;

  public QuestaoVerdadeiroFalso(int idQuestao, String enunciado, String opcaoA, String opcaoB, String opcaoC,
      double notaPadrao) {
    super(idQuestao, enunciado, opcaoA, opcaoB, opcaoC, notaPadrao);
    this.respostaCorretaA = 'F';
    this.respostaCorretaB = 'V';
    this.respostaCorretaC = 'F';
  }

  public double calcularNotaObtida() {
    double nota = 0;
    if (respostaMarcadaA == respostaCorretaA) {
      nota += 1.0;
    }
    if (respostaMarcadaB == respostaCorretaB) {
      nota += 1.0;
    }
    if (respostaMarcadaC == respostaCorretaC) {
      nota += 1.0;
    }
    return nota;
  }

  public void marcaOpcao(char respostaMarcada) {
    int contador = 1;
    respostaMarcada = Character.toUpperCase(respostaMarcada);
    if(contador == 1){
    this.respostaMarcadaA = respostaMarcada;
    contador++;
    }
    if(contador == 2){
      this.respostaMarcadaB = respostaMarcada;
      contador++;
    }
    if(contador == 3){
    this.respostaMarcadaC = respostaMarcada;
    }
  }
}