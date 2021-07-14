
public class TesteIR {

	public static void main(String[] args) {
		
		System.out.println("*** Verifica��o de IR (Olha o Le�o) ***");
		
		double salario = 4663.0;
		
		System.out.println("Ol� seu sal�rio �: R$" + salario);
		
		if(salario <= 1899.9){
			System.out.println("O seu sal�rio n�o entra na verifica��o do IR.");			
		}
		else if(salario <= 2800.0) {
			salario = salario - 142;
			System.out.println("O IR descontado do seu sal�rio ser� de 7.5% e pode deduzir R$142"
					+ " voc� ir� receber R$" + salario);
			
		}
		else if(salario <= 3751.0) {
			salario = salario - 350;
			System.out.println("O IR descontado do seu sal�rio ser� de 15% e pode deduzir em R$350"
					+ " voc� ir� receber R$" + salario);
		}
		else if(salario <= 4664.0) {
			salario = salario - 636;
			System.out.println("O IR descontado do seu sal�rio ser� de 22.5% e pode deduzir em R$636"
					+ " voc� ir� receber R$" + salario);			
		}
		else {
			salario = salario - 869;
			System.out.println("O IR descontado do seu sal�rio ser� de 27.5% e pode deduzir em R$869"
					+ " voc� ir� receber R$" + salario);
			
		}
		System.out.println("*** Obrigado por usar o sistema ***");

	}

}
