package hello;

public class Mention {

	public static void main(String[] args) {
		// si note < 10 "peut mieux faire"
		// si 10 <= 12 note 14 "passable"
		// si 12 <= 14 note 16 "ab"
		// si 14 <= 16 note 14 "b"
		// si 16 <= note "tb"

		int note = 17;

		if (note < 10) {
			System.out.println("Peut mieux faire");
		} else if (note >= 10 && note < 12) {
			System.out.println("Passable");
		} else if (note >= 12 && note < 14) {
			System.out.println("Assez bien");
		} else if (note >= 14 && note < 16) {
			System.out.println("Bien");
		} else if (note >= 16) {
			System.out.println("Très bien");

		}
		// correction: quand on passe à la deuxième condition, c'est que la première est
		// exclue etc
		// if (a<10) ...
		// if else (a<12) ...
		// else
	}
}
