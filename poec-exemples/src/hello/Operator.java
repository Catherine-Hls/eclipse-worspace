package hello;

public class Operator {

	public static void main(String[] args) {
		System.out.println(1 + 1);
		
		System.out.println(40 / 3);
		// Java tronque le résultat et on obtient un entier
		
		// Pour obtenir un résultat décimal
		System.out.println(40.0 / 3.0);
		System.out.println(40 *1.0 / 3);
		
		//regles de précédance: plus c'est haut dans le tableau, plus il y a la priorité. Quand c'est
		// sur la même ligne: c'est de gauche à droite
		System.out.println(1 + 2 * 3);
		
		//modulo: reste de la division euclidienne
		// a % b => a = q * b + r
		// 4 % 2 => 4 = q * 2 + r => r = 0
		// 10 % 3 => 10 = q * 3 + r => r = 1
		// a % b ==0 alors a est divisible par b 
		
		int i = 42;
		int a = 0;
		a = i++;
		
		System.out.println(i);
		System.out.println(a);
		
		// autre manière d'incrémenter
		i +=10;
				
		//boleen
		System.out.println(5 == 3);
		System.out.println(5 == 5);
		
		//nb: un caractère est un entier
		char c = 'a';
		char d = ++c;
		System.out.println(d);
		System.out.println('c' == 99);
		
	}

}
