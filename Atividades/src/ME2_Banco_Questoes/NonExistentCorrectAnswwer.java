package ME2_Banco_Questoes;

public class NonExistentCorrectAnswwer extends Exception {
    @Override
    public String getMessage(){
        return "A letra da resposta indicada como correta não existe!";
    }
}