package ME2_Banco_Questoes;

public class NonExistentCorrectAnswwer extends Exception {
    public String getMessage(){
        return "Não existe resposta correta";
    }
}