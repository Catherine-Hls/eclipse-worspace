package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int nombreADeviner = 8;
		int compteur = 0;
		
		
		// ecrire un pgm qui demande 
		// a l'utilisateur de deviner un nombre entre 1 et 10 
		// tant que l'utilisatuer n'a pas devine le bon nombre, ecrire "perdu
		// et redemander a deviner
		// quand l'utilsatuer a devine le bon nombre, 
		// ecrire "gagné" 
		// et quitter
		
		for(;;) {
			
			int choixUtilisateur = sc.nextInt();
			if (choixUtilisateur == nombreADeviner) {
				System.out.println("Gagné!");
				break;
			} else {
				System.out.println("Perdu!");
			}
		}
				
		for (;;) {
			int choixUtilisateur = sc.nextInt();
			compteur ++; 
			if (choixUtilisateur == nombreADeviner) {
				System.out.println("Gagné");
				System.out.print("Vous avez gagné en: ");
				System.out.print(compteur);
				System.out.println("coups");
				break;
			} else {
				System.out.println("Perdu");
				
			}
			
			
		
		}
			
			

	}

}
