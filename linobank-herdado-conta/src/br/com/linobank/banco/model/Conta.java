package br.com.linobank.banco.model;

import java.io.Serializable;

/**
 * Essa classe representa a moldura de uma conta no banco
 * 
 * @author fabio.lino
 * @version 0.1
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>, Serializable {

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular; //N?o faz parte da serializacao, hoje em dia tamb?m ? feito por Anotacao
    private static int total = 0;  //static O static faz com que o atributo seja da classe, e n?o mais do objeto. 
	//Com isso, todo o objeto conta possui acesso a um ?nico total
    
    /**
     * Contrutor para inicializar o objeto Conta no banco respeitando a regra de negocio a partir de uma agencia e numero de conta.
     * 
     * @param agencia
     * @param numero
     */
    		

    public Conta(int agencia, int numero){ //Contrutor
        Conta.total++;
        //System.out.println("O total de contas ? " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        
        if(agencia < 1) {
            throw new IllegalArgumentException("Agencia inv?lida");
        }

        if(numero < 1) {
            throw new IllegalArgumentException("Numero da conta inv?lido");
        }
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }
    
    @Override
    public boolean equals(Object ref) {
    	
    	Conta outra = (Conta) ref;
    	
    	if(this.agencia != outra.agencia) {
    		return false;
    	}
    	
    	if(this.numero != outra.numero) {
    		return false;
    	}
    	
    	return true;
    }
    
    @Override
    public int compareTo(Conta outra) { //a Interface Comparable exige a implementacao do metdo compareTo
        return Double.compare(this.saldo, outra.saldo);
    }
    
    @Override
	public String toString() {
		return "Agencia: " + this.agencia + " Numero: " + this.numero + " Saldo em conta: R$" + this.saldo;
	}


	public abstract void deposita(double valor);
    
    /**
     * Valor precisa ser maior que o saldo
     * 
     * @param valor
     * @throws SaldoInsuficienteException
     */

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) { // saldo insuficiente
			throw new SaldoInsuficienteException(" Saldo: R$" + this.saldo + ", Valor: R$" + valor);

		}

		this.saldo -= valor;

	}

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);              
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}