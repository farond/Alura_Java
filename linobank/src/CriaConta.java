
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Saldo em primeira conta R$" + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo em primeira conta R$" + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		System.out.println("Saldo em segunda conta R$" + segundaConta.saldo);
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);
        
        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta");
		}
		else {
			System.out.println("contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
				
	}

}
