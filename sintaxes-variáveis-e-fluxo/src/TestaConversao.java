
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1270.50;
		
		float pontoFlutuante = 3.14F;
		System.out.println(pontoFlutuante);
		
		int valor = (int) salario;
		
		System.out.println(valor);
	//Se printarmos valor, ser� mostrada apenas a parte inteira daquele n�mero: 1270. 
	//� isso que chamamos de casting que, nestas vari�veis que guardam n�meros, n�o � algo muito complexo. 
	//Mais adiante, veremos o casting de vari�veis que s�o refer�ncia, e t�m a ver com orienta��o a objetos, 
	//se s�o compilados ou n�o, se dar�o exceptions; � um mundo � parte.
		
		long numeroGrande = 32432423523L;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.print(total);
		
	}

}
