package hello;



public class TTTGrid {

	private char[][] tab;

	public TTTGrid(int size) {
		tab = new char[size][size];
	}

	public void put(char c, int x, int y) {
		tab[y][x] = c;
	}

	// public void print() {
	// // pour toutes les lignes
	// for(int y = 0; y < tab.length; y++) {
	// // séparateur haut
	// for(int i = 0; i < tab.length; i++) {
	// System.out.print("----");
	// }
	// System.out.println("-");
	//
	// // générer une ligne
	// for(int x = 0; x < tab.length; x++) {
	// System.out.print("| ");
	// if(tab[x][y] == '\u0000') {
	// System.out.print(" ");
	// } else {
	// System.out.print(tab[x][y]);
	// }
	// System.out.print(" ");
	// }
	// System.out.println("|");
	//
	// }
	//
	// // dernier séparateur
	// for(int i = 0; i < tab.length; i++) {
	// System.out.print("----");
	// }
	// System.out.println("-");
	//
	//
	// }

	public void print() {
		StringBuilder output = new StringBuilder();

		// pour toutes les lignes
		for (int y = 0; y < tab.length; y++) {
			// séparateur haut
			printSeparator(output);
			// générer une ligne
			printLine(y, output);
		}
		// dernier séparateur
		printSeparator(output);

		System.out.println(output);

	}
	
	private void printSeparator(StringBuilder output) {
		for (int i = 0; i < tab.length; i++) {
			output.append("----");
		}
		output.append("-\n");	
	}
	
	private void printLine(int y, StringBuilder output) {
		for (int x = 0; x < tab.length; x++) {
			output.append("| ");
			if (tab[x][y] == '\u0000') {
				output.append(" ");
			} else {
				output.append(tab[x][y]);
			}
			output.append(" ");
		}
		output.append("|\n");
	}

	public void checkWin() {
		boolean win = false;
		
		for (int i = 0; i < tab.length; i++) {
			if ((tab[0][i] == tab[1][i]) && (tab[0][i] == tab[2][i])) {
				} else if ((tab[i][0] == tab[i][1]) && (tab[i][0] == tab[i][2])) {
					} else if ((tab[i][0] == tab[i][1]) && (tab[i][0] == tab[i][2]))  {
						
					}
				}
		
		/*if ((tab[0][0] == tab[1][1]) && (tab[0][0] == tab[2][2])) {
		} else if ((tab[0][0] == tab[1][0]) && (tab[0][0] == tab[2][0])) {
			} else if ((tab[0][0] == tab[1][0]) && (tab[0][0] == tab[2][0])) {
				} else if ((tab[0][0] == tab[1][0]) && (tab[0][0] == tab[2][0]))
		}		*/
	}

	/*public void checkWin() {
		boolean win = false;*/
		
			
		
	}

	 

