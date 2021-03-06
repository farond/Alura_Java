package br.com.linobank.banco.test.util;

import java.util.ArrayList;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		/*
		 * Conta cc = new ContaCorrente(22, 111); Conta cc2 = new ContaCorrente(22,
		 * 1212);
		 * 
		 * boolean igual = cc.ehIgual(cc2); System.out.println(igual);
		 */
		
		// Generics<>
		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 1212);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 1212);
		
		boolean existe = lista.contains(cc3);
		System.out.println("J? existe? " + existe);
		
		for (Conta conta : lista) {
			if(conta == cc3) {
				System.out.println("J? tenho essa conta");
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);		
		}
	}
		

}
