package br.com.linobank.banco.model;

//br.com.linobank.banco.modelo.CalculadoDeImposto => FQN
public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}

}
