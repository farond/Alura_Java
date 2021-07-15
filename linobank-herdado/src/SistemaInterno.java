
public class SistemaInterno {
	
	private int senha = 123456;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Entrada autorizada!");
		}
		else {
			System.out.println("Entrada não autorizada!");
		}
	}
	

}
