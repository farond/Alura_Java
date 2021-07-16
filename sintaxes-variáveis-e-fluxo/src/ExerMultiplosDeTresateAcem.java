
public class ExerMultiplosDeTresateAcem {

	public static void main(String[] args) {
		for (int n = 1; n < 100; n++) {
			if(n % 3 == 0) {
				  System.out.println(n);
				}			
		}
		System.out.println("* Outra forma *");
		for (int n = 3; n < 100; n += 3 ){
            System.out.println(n);
        }

	}

}
