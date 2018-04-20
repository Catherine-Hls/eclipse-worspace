package hello;

public class FizzBuzz {

	public static void main(String[] args) {
		// System.out.println("fizz" + 3);
		
		// ecrire un pgm qui pour tous les nb de 0 a 100 inclus
		// affiche "nombre FIZZ" si le nb est multiple de 3
		// affiche "nombre BUZZ" si nombre est multiple de 5
		// affiche nombre "FIZZBUZZ" si nombre est multiple de 3 et 5
		
		
		
		// if (nombre %  3 == 0) {
			// System.out.println("FIZZ");
		// } else if (nombre % 5 == 0) {
				// System.out.println("FIZZBUZZ");
				
		// }
		
		// if (nombre %  5 == 0) {
			// System.out.println("FIZZ");
		// } else if (nombre % 3 == 0) {
				// System.out.println("FIZZBUZZ");
		// }
		//variante 1
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 5)) {
				System.out.println(i + "FIZZBUZZ");
			} else {
				if (i % 3 == 0) {
			}
				System.out.println(i + "FIZZ");
			}  if (i % 5 == 0) {
				System.out.println(i + "BUZZ");
			}
		}
		//variante 2
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) && (i % 5 == 5)) {
				System.out.println(i + "FIZZBUZZ");
				continue;
			} 
			if (i % 3 == 0) {
				System.out.println(i + "FIZZ");
			
			}  if (i % 5 == 0) {
						System.out.println(i + "BUZZ");
			}
						}
	
		// variantes 3 et 4 : avec %15 en if, ou else if 
	
	}

	}
			

