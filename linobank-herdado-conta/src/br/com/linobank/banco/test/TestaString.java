package br.com.linobank.banco.test;

public class TestaString {

	public static void main(String[] args) {
		
		String empty = "   Fabio    ";
		String vazio = empty.trim();
		System.out.println(empty);
		System.out.println(empty.contains("bio"));
		System.out.println(vazio);


		String nome = "Fabio"; //Object literal
		
		
		//String outro = nome.replace("F", "o");
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("bi");
//		System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
		
//		char c = 'F';
//		char d = 'o';
//		String outro = nome.replace(c, d);
		
		
		
		//String outro = nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outro);

	}

}
