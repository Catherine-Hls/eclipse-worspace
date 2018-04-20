package hello;

public class UtilNote {

	public double calcMoyenne(int notes []) {
		
		int somme = 0;
		for (int i = 0; i < notes.length; i++) {
			somme += notes[i];
			//System.out.println(somme);
		}	
		
		double moyenne;
		moyenne = somme / (1.0 * (notes.length));
		return moyenne;
	}

	public int findMin(int notes []) {
		
		int min = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] < min) {
				min = notes[i];
			}
		}
		return min;
	}
		
	public int findMax(int notes []) {
		
		int max = notes[0];
		for (int i = 1; i < notes.length; i++) {
			if (notes[i] > max) {
				max = notes[i];
			}
		}
		return max;
	}

}
