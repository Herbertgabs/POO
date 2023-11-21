package Atividade_Revista;

public class Main {
	public static void main (String[] args) {
        Revista revista = new Revista(1, "Revista1");

        revista.adicionaEdicao(52, 1000);
        revista.adicionaEdicao(53, 900);
        revista.adicionaEdicao(54, 1200);

        int[][] vendas = {{52, 800}, {53, 900}, {54, 1000}};

        for (int[] venda : vendas) {
            for (Edicao edicao : revista.getListaEdicoes()) {
                if (edicao.getNumeroEdicao() == venda[0]) {
                    edicao.informaVenda(venda[1]);
                }
            }
        }

        int numeroEdicao = 53;
        System.out.println("Edição " + numeroEdicao + ": " + revista.reciclaEdicao(numeroEdicao));
        System.out.println("Reciclagem produzida: " + revista.getReciclagemProduzida());

        numeroEdicao = 54;
        System.out.println("Edição " + numeroEdicao + ": " + revista.reciclaEdicao(numeroEdicao));
        System.out.println("Reciclagem produzida: " + revista.getReciclagemProduzida());

        numeroEdicao = 54;
        System.out.println("Edição " + numeroEdicao + ": " + revista.reciclaEdicao(numeroEdicao));
        System.out.println("Reciclagem produzida: " + revista.getReciclagemProduzida());

        numeroEdicao = 99;
        System.out.println("Edição " + numeroEdicao + ": " + revista.reciclaEdicao(numeroEdicao));
        System.out.println("Reciclagem produzida: " + revista.getReciclagemProduzida());
    }
}
