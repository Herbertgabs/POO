package Atividade_Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int numero;
    private String nome;
    private List<Conta> contas;
	   
    public Banco(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void abreConta(int numeroConta, int digitoConta) {
        contas.add(new Conta(numeroConta, digitoConta));
    }
 
    public void fechaConta(int nrConta) {
    	for (Conta conta: contas) {
    		if (conta.getNumero()==nrConta) {
    			conta.fecha();
    		}
    	}
    }
      
    public void excluiConta(int nrConta) {
    	for (Conta conta: contas) {
    		if (conta.getNumero()==nrConta) {
    			contas.remove(conta);
    		}
    	}
    }   
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public List<Conta> getContas() {
		return contas;
	}
    
    

}