package br.com.linobank.banco.test;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; //inicializa o array com os valores padroes 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		
//		idades[0] = 29;
//		idades[1] = 39;
//		idades[2] = 85;
//		idades[3] = 15;
//		idades[4] = 26;
		
		
		
//		int idade1 = idades[1];
//		int idade2 = 45;
//		int idade3 = 85;
//		int idade4 = 15;
//		int idade5 = 29;
		
//		System.out.println(idade1);
//		
//		System.out.println(idades.length);

	}

}
