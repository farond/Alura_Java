package br.com.alura;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        
        for (String chaves : nomesParaIdade.keySet()) {
        	System.out.println(chaves);
			
		}
        
        for (Integer idade : nomesParaIdade.values()) {
			System.out.println(idade);
		}
        
        for (String chave : nomesParaIdade.keySet()) {
			System.out.println(chave + " - " + nomesParaIdade.get(chave));
		}
        
        
        
    }
}
