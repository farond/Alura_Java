//contrato Autenticavel
	//quem assinar esse conrtato precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {
	
	//interface n�o tem metodos concretos

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
