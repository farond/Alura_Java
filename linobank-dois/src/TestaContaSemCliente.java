
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDanilva = new Conta();
		System.out.println(contaDanilva.getSaldo());
		
		contaDanilva.titular = new Cliente();
		System.out.println(contaDanilva.titular);
		
		contaDanilva.titular.nome = "Danilva";
		System.out.println(contaDanilva.titular.nome);
	}

}
