
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente fabio = new Gerente();
		fabio.setNome("Fabio Lino");
		fabio.setCpf("777.777.777-77");
		fabio.setSalario(2600.00);
		
		System.out.println(fabio.getNome());
		System.out.println(fabio.getBonificacao());
		

	}

}
