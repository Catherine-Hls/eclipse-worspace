package hello;

public class NombresPairs {

	public static void main(String[] args) {
		// 1) afficher les nombre de 1 à 100 inclus
		// 2) afficher les nombre pair de 1 à 100 inclus
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 2; i <= 100; i+=2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
