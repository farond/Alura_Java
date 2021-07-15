//Administrador é um funcionario, Administrador herda da classe funcionario, assina o contrato Autenticavel, e é um Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
	
	private Autentificador autenticador;
	
	public Administrador() {
		this.autenticador = new Autentificador();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
	}
		
	@Override
	public void setSenha(int senha) {		
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha)  {
		return this.autenticador.autentica(senha);
		
	}	

}
