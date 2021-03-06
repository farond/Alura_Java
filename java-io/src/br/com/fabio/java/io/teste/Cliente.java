package br.com.fabio.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente do LinoBank
 * 
 * @author fabio.lino
 * @version 0.1
 */

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 692091258849311499L;
	
	String nome;
	String cpf;
	String profissao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	

}