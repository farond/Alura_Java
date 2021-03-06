package br.com.linobank.banco.test;

import br.com.linobank.banco.especial.ContaEspecial;
import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.ContaPoupanca;
import br.com.linobank.banco.model.SaldoInsuficienteException;


public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
				
		ContaCorrente cc = new ContaCorrente(111, 1111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 2222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("Saldo conta corrente R$" + cc.getSaldo());
		System.out.println("Saldo conta poupan?a R$" + cp.getSaldo());
		
	}
	
}
