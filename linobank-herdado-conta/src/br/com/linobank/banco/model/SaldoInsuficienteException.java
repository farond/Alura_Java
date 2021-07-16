package br.com.linobank.banco.model;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException(String msg)	{
		super(msg);
		
	}
}
