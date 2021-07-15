
public class TestaSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(123456);
		
		Administrador adm = new Administrador();
		adm.setSenha(13456);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(123456);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);

	}

}
