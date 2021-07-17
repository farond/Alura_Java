package br.com.linobank.banco.model;

public class GuardaContas {
	
	
 
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardaContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++; //depois incrementa
	}

	public int getElementosQuantidade() {		
		return this.posicaoLivre;
		
	}
	
	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
}
