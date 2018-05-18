package test;

import java.util.Objects;

public class A {
	/**
	 * G�n�re repr�sentatin hexad�cimale pour une couleur
	 * Par exemple black retournera #000000, white #FFFFFF, red #FF0000
	 * @param name le nom de la couleur
	 * @return repr�sentation h�xad�cimale de la couleur
	 * @throws RuntimeException si la couleur n'est pas support�e
	 * @throws NullPointerException si name est null
	 */
	
	public String getHexColor(String name) {
		Objects.requireNonNull(name, "Name must not be null");
		//Map<String, String>
		
		
		/*if(name.equals("black")) {
			return "#000000";
		} else if(name.equals("white")) {
			return "#FFFFFF";
		} else if(name.equals("red")) {
			return "#FF0000";
		}*/
		switch (name) {
		case "black": return "#000000";
		case "white": return "#FFFFFF";
		case "red": return "#FF0000";
		
		default:
			throw new RuntimeException("Unsuported color");
		}
		
	
}
}
