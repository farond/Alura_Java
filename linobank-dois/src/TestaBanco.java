
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente fabio = new Cliente();
		fabio.nome = "Fabio Lino";
		fabio.cpf = "777.777.777 - 77";
		fabio.profissao = "programador";
		
		Conta contaFabio = new Conta();
		contaFabio.deposita(100);
		
		// associa o cliente fabio a contaFabio
		contaFabio.titular = fabio;
		System.out.println(contaFabio.titular.nome);
	}
	
	

}
