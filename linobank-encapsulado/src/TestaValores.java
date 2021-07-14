
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 25588);
	
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(1337, 16587);
		Conta conta3 = new Conta(122, 16587);
		
		System.out.println(Conta.getTotal());
	}

}
