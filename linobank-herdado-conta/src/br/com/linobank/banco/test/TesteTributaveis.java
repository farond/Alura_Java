package br.com.linobank.banco.test;

import br.com.linobank.banco.model.CalculadorDeImposto;
import br.com.linobank.banco.model.ContaCorrente;
import br.com.linobank.banco.model.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		
		System.out.println(calc.getTotalImposto());
	}

}
