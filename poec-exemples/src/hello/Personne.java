package hello;

	// variables d'instance
	public class Personne {
	private String prenom;
	String nom;
	int age;
	
	
	//constructeurs
	
	public Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	// méthodes
	public String getFullname() {
		return prenom + " " + nom;
	}
	
	public String getPrenom() {
		return prenom;
	}	
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAge() {
		return nom;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	
	
}