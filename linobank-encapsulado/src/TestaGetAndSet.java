
public class TestaGetAndSet {
	public static void main(String[] args) {
		Conta conta = new Conta(3130,1377);
		//conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente fabio = new Cliente();
		//conta.titular = fabio;
		
		fabio.setNome("Fabio Lino");
		conta.setTitular(fabio);
		
		System.out.println("Nome do titular da conta: " + conta.getTitular().getNome()); //aqui pega a referencia do titular e o nome inputado
		
		
		conta.getTitular().setCpf("Programador");
		
		//<es,o código de cima em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta);
		System.out.println(fabio);
		System.out.println(conta.getTitular());
	}

}
