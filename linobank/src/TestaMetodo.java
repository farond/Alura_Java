
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaFabio = new Conta();
		contaFabio.saldo = 100;
		contaFabio.deposita(50);
		
		System.out.println("O saldo de sua conta ? R$" + contaFabio.saldo);
		
		boolean conseguiuRetirar = contaFabio.saca(30);
		System.out.println("Saldo da sua conta atual R$" + contaFabio.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDanilva = new Conta();
		contaDanilva.deposita(1000);
		
		boolean sucessoTransferencia = contaDanilva.transfere(50, contaFabio);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia efetuada com sucesso!");
		}
		else {
			System.out.println("Dinheiro insuficiente para a transferencia");
		}
		System.out.println(contaDanilva.saldo);
		System.out.println(contaFabio.saldo);
	}

}
