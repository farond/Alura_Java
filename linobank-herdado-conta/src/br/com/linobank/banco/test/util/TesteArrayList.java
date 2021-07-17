package br.com.linobank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		// Generics
		List<Conta> lista = new ArrayList<Conta>();// thread safe

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 1212);

		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);

		for (Conta conta : lista) {
			if (conta == cc3) {
				System.out.println("Já tenho essa conta");
			}
		}

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
