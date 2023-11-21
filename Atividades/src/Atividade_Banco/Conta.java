package Atividade_Banco;

public class Conta {
	private int numero;
	private int digito;
	private double saldo;
    private boolean situacao;
    
    public Conta(int numero, int digito) {
    	this.numero = numero;
    	this.digito = digito;
    	this.situacao = true;
    }
    public boolean saque(double valor) {
        if (situacao && valor<=saldo) {
           saldo -= valor;
           return true;
        }
        return false;
    }
    
    public boolean deposito(double valor) {
      if (situacao) {
    	  saldo += valor;
    	  return true;
      }
      return false;
    }

    public boolean fecha() {
        if (situacao && saldo==0) {
           situacao=false;
           return true;
        }
        return false;
    }
	
	public int getNumero() {
		return numero;
	}

	public int getDigito() {
		return digito;
	}

	public double getSaldo() {
		return saldo;
	}	
}