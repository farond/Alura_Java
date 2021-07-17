package br.com.linobank.banco.test;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		
		ContaCorrente cc1 = new ContaCorrente(3130, 6087);
		ContaCorrente cc2 = new ContaCorrente(3130, 9085);
		ContaPoupanca cc3 = new ContaPoupanca(3130, 8284);
		ContaCorrente cc4 = new ContaCorrente(3130, 1587);
		
		contas[0] = cc1;
		contas[1] = cc2;
		contas[2] = cc3;
		contas[3] = cc4;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[2]);
		System.out.println(contas[3]);
		System.out.println(contas[1].getNumero());
		
		Conta ref = contas[1];
//		ContaPoupanca ref = (ContaPoupanca) contas[1];//type cast
		System.out.println(ref);
		System.out.println(ref.getNumero());
		
	}

}
