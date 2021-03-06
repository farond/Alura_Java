package br.com.alura;

import java.util.Objects;

public class Aluno {

	private String nome;
	private Integer numeroMatricula;
	
	
	public Aluno(String nome, Integer numeroMatricula) {
		if(nome == null) {
			throw new NullPointerException("Nome n?o pode ser vazio");			
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}
	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public String toString() {
		
		return ("Aluno: " + this.nome + ", matricula: " + this.numeroMatricula);
	}	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroMatricula, other.numeroMatricula);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroMatricula);
	}

}
