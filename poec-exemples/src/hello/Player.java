package hello;

public class Player {
	
	// variables d'instance
	private String name;
	private char symbole;
	
	// constructeur
		public Player(String name, char symbole) {
			this.name = name;
			this.symbole = symbole;
		}
		
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbole() {
		return symbole;
	}

	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	
	


	
	
}
