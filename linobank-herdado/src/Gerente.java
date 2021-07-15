//Gerente é um funcionario, Gerente herda da classe funcionario, assina o contrato Autenticavel, e é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private Autentificador autenticador;
	
	public Gerente() {
		this.autenticador = new Autentificador();
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
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
