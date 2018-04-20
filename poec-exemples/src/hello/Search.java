package hello;

public class Search {

	public static void main(String[] args) {
		int[] data = {1, 2, 5, 10, 72, 42, 33};
		
		// ecrire un pgm qui cherche si le nb 10 est dans le tableau
		//si present, ecrire "trouve"
		// sinon ecrire "pas trouve"
		
	boolean found = false;
	for (int i = 0; i < data.length; i++) {
		if(data[i] == 10) {
			found = true;
			break; //early exit 
		}	
	}
	
	}

}
