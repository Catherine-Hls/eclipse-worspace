package hello;

public class ArrayDemo {

	public static void main(String[] args) {
		int[]tab = { 1, 2, 3, 4, 5, 6};
		System.out.println(tab[0]);
		System.out.println(tab[5]);
		tab[0] = 42;
		System.out.println(tab[0]);
		
		System.out.println(tab.length);
		
		String[]tableau = {"Hello", "World"};
		System.out.println(tableau.length);
		
		int[] tabDeTaille6 = new int[6];
		tabDeTaille6[0] = 156;
		
		System.out.println(tabDeTaille6[1]);
		System.out.println(tabDeTaille6[1]);
		
		for (int i = 0; i < tableau.length; i++) {
			System.out.println(tableau[i]);
			
		}
	}

}
