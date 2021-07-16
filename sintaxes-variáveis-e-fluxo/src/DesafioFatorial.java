public class DesafioFatorial {

	public static void main(String[] args) {
		int fatorial = 0;
		for (int i = 0; i < 21; i++) {
			if (i == 0) {
				fatorial = 1;
			} 
			else {
				fatorial *= i;
			}
			System.out.println("Fatorial de " + i + " != " + fatorial);
		}

	}

}
