package hello;

public class PersonneMain {

	public static void main(String[] args) {
		Personne p1 = new Personne("Bob", "l'éponge",4);
		/*System.out.println(p1);
		p1.prenom = "Bob";
		System.out.println(p1.prenom);*/
		
		/*p1.nom = "L'éponge";
		System.out.println(p1.nom);
		System.out.println(p1.age);*/
		
		// fullname => prenom + " " + nom
		System.out.println(p1.getFullname());
		
		Personne p2 = new Personne("a", "b", 3);
	/*	System.out.println(p2.prenom);
		System.out.println(p2.nom);
		System.out.println(p2.age);*/
		
		/*p1.getPrenom();
		p1.setPrenom();*/
		
	
		

	}

}
