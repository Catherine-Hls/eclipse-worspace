package formation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean (name = "jeu", eager = true)
@SessionScoped
public class Jeu {
	int nombreAdeviner = (int) (Math.random() * 100);
	int input;
	String result;
	int counteur = 10;
	
	
	
	public void setInput(int input) {
		this.input = input;
	}



	public int getNombreAdeviner() {
		return nombreAdeviner;
	}



	public int getInput() {
		return input;
	}



	public String getResult() {
		return result;
	}



	public int getCounteur() {
		return counteur;
	}



	public String test() {
		if (nombreAdeviner == input ) {
			result = "gagné!";
		} else if (input > nombreAdeviner) {
			result="Trop long";
			counteur --;
		} else if (input < nombreAdeviner) {
			result="Trop court";
			counteur --;
		}
		return result;
		}
}
	
	


