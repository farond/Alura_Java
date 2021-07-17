package br.com.linobank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.linobank.banco.model.Cliente;
import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.ContaPoupanca;

public class TesteArrayListWithGenerics {
	
	public static void main(String[] args) {
		
		//Generics<>
		//ArrayList<Conta> lista = new ArrayList<Conta>();
		//LinkedList<Conta> lista = new LinkedList<Conta>();
		List<Conta> lista = new LinkedList<Conta>();
		
		Conta cc = new ContaCorrente(22, 111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 1212);
		lista.add(cc2);
		
		
		System.out.println(lista.size());		
		Conta ref = (Conta) lista.get(0);		
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		

		Conta cc3= new ContaCorrente(32, 311);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(32, 4214);
		lista.add(cc4);
		
		Conta cc5 = new ContaPoupanca(32, 4669);
		lista.add(cc5);
		
		for(int i = 0; i < lista.size(); i++) {
			//devolve ref Object
			System.out.println(lista.get(i));
		}
		
		System.out.println("----***********************************----");
		
		for(Conta conta  : lista) {
			System.out.println(conta);
		}
		System.out.println("Tamanho: " + lista.size());
		
	}

}
