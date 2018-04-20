package hello;

public class Notes {

	public static void main(String[] args) {
		int[] notes = {18, 20, 2, 14, 7, 10};
		
		// moyenne
		// plus grande valeur
		
		int somme = 0;
		for (int i = 0; i < notes.length; i++) {
			somme += notes[i];
			//System.out.println(somme);
		}	
		
		double moyenne;
		moyenne = somme / (1.0 * (notes.length));
		// moyenne = (double) somme / notes.length; -- c'est un cast pour forcer le "format" 
		
		System.out.println("avg:" + moyenne);
		
		// plus petite valeur
		
		//int min = Integer.MAX_VALUE; i=0 dans ce cas
		int min = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] < min) {
				min = notes[i];
			}
		}
		System.out.println("min:" + min);
	
		
		
		//Pour chaque note: note courante _ moyenne au carré
	// v += (notes[i] - moyenne) * (notes[i]) * i /notes.lenght
		//(n-moy)^2/nb notes
		
		
	}

}


