package hello;

public class Article {
	//variables d'instance
	private String titre;
	private double prix;
	
	// constructeurs
	public Article(String titre, double prix) {
		this.titre = titre;
		this.prix = prix;
	}
	
	// accesseurs
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	

	
	
}