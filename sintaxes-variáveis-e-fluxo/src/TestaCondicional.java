
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 20;
		int quantidadePessoas = 5;
		if (idade >= 18) {
			System.out.println("Voc� tem mais de 18 anos");
			System.out.println("Seja bem vindo!");			
		}
		else {
			if(quantidadePessoas >= 2) {
				System.out.println("Voc� n�o tem 18 anos, mas " + "pode entrar, pois est� acompanhado");
			}
			else {
				System.out.println("Lamentamos, mas voc� n�o pode entrar");
			}
		}	
			
	}

}
