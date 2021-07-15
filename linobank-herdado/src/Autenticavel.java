//contrato Autenticavel
	//quem assinar esse conrtato precisa implementar
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel {
	
	//interface não tem metodos concretos

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
