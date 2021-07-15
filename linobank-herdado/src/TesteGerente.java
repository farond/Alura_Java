
public class TesteGerente {

	public static void main(String[] args) {
		
		Autenticavel referencia = new Cliente(); //metodo generico por conta da interface
		
		Gerente g1 =  new Gerente();
		
		g1.setNome("Fabio");
		g1.setCpf("44788899948");
		g1.setSalario(5000.0);

		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123456);		
		boolean autenticou = g1.autentica(123456);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}

}
