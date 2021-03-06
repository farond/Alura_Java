package br.com.linobank.banco.test;

import br.com.linobank.banco.model.Conta;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.GuardaContas;

public class TesteGuardaReferencias {
	
	public static void main(String[] args) {
		GuardaContas guarda = new GuardaContas();
		
		Conta cc = new ContaCorrente(22, 111);
		guarda.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22, 1212);
		guarda.adiciona(cc2);
		
		int tamanho = guarda.getElementosQuantidade();
		System.out.println(tamanho);
		
		Conta ref = guarda.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}
