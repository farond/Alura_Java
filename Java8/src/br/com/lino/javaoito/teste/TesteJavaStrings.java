package br.com.lino.javaoito.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;


public class TesteJavaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("Java 8 na Alura");
		palavras.add("Fabio Lino");
		palavras.add("Alura");
		palavras.add("Gostei dessa funcao lambda");
		palavras.add("Testando novas funcoes");

//		for (String words : palavras) {
//			System.out.println(palavras);
//		}

		// RegrasMetodo regras = new RegrasMetodo();
		System.out.println("******* Ordenando pelo tamanho da palavra ********");
		System.out.println("*******  Da maior para menor ********");
//		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
		palavras.forEach((s) -> System.out.println(s));

//		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		System.out.println("******* Em Ordem Alfabetica ********");
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length())
//				return -1;
//			if (s1.length() > s2.length())
//				return 1;
//			return 0;
//		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		System.out.println(palavras);
		palavras.sort(comparing(String::length));
		System.out.println(palavras);
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(palavras);
		

		System.out.println("******* Regra UpperCase todas as String da lista ficam em caixa alta CAPSLOCK ********");
		palavras.replaceAll(String::toUpperCase);
		System.out.println(palavras);
		
//		new Thread(new Runnable() {
//
//		    @Override
//		    public void run() {
//		        System.out.println("Executando um Runnable");
//		    }
//
//		}).start();
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}

//class ImprimeNaLinha implements Consumer<String>{
//
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}
//
//class ComparadorPorTamanho implements Comparator<String> {
//
//    @Override
//    public int compare(String s1, String s2) {
//        if (s1.length() < s2.length())
//            return -1;
//        if (s1.length() > s2.length())
//            return 1;
//        return 0;
//    }
//}
