package br.com.linobank.banco.test;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(321, 123);
		
		conta.deposita(200.0);
		try {
			conta.saca(210.0);
		}
		catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
		

	}

}
