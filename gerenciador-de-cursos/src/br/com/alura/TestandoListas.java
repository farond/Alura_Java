package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhencedo mais de Listas";
		String aula2 = "Entender a linguagem Java e orienta��o a objetos";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);	
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);	
		
		for (String aula : aulas) { //para cada string aula dentro de aulas faca o seguinte
			System.out.println("Aula: "+ aula);
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula �: " + primeiraAula);
		
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
			System.out.println(aulas.size());
			
			aulas.forEach(aula -> {
				System.out.println("Percorrendo: ");
				System.out.println("Aula " + aula);
				});
			
			aulas.add("Aprofundar em Java moderno e TDD");
			System.out.println(aulas);
			
			Collections.sort(aulas);
			System.out.println("Depois de Ordenado: " + aulas);
			
			
	}

}
