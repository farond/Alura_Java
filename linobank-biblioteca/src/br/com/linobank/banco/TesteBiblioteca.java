package br.com.linobank.banco;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123, 321);
		
		c.deposita(500.5);
		
		System.out.println("Saldo em conta R$" + c.getSaldo());
		
	}

}
