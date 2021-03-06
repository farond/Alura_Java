package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {
	
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>(); //nao tem garantia de ordem dos objetos
		alunos.add("Fabio Lino");
		alunos.add("Sarah Christina");
		alunos.add("Ronaldo Lino");
		alunos.add("Danilva Lino");
		alunos.add("Veludo Gato");
		alunos.add("Jos? Francisco");
		alunos.add("Jacira");
		
		boolean alunoEstaMatriculado = alunos.contains("Fabio Lino");
		System.out.println(alunoEstaMatriculado);
		System.out.println(alunos.size());
		alunos.add("Jacira");
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		Collections.sort(alunosEmLista);
		System.out.println("Ordenados por ordem alfabetica: " + alunosEmLista);
	}

}
