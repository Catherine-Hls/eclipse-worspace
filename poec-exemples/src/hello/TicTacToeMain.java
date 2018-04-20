package hello;

import java.util.Scanner;

public class TicTacToeMain {

	public static void main(String[] args) {
		// Créer un jeu de morpion qui peut se jouer à 2 joueurs
		
		// 1) créer la classe grille suivant ces spécifications
		TTTGrid grid = new TTTGrid(3);
		
		Scanner input = new Scanner(System.in);
	
		Player player1 = new Player ("bob", 'X');
		Player player2 = new Player ("tom", 'O');
				
		Player[] tabPlayers = {player1, player2};
		
		for (;;) {
			for (int i = 0; i < tabPlayers.length; i++) {
					
				System.out.println("Player " + tabPlayers[i].getName()  + " choose a (x,y) position");
				int choiceX = input.nextInt();
				int choiceY = input.nextInt();
				grid.put(tabPlayers[i].getSymbole(), choiceX, choiceY);
				grid.print();		
			
			}
		
			
		
		grid.checkWin();
		
			
			
		// void put(char symbol, int x, int y);
		/*grid.put('X', 1, 2);
		grid.print();
		grid.put('O', 0, 0);
		grid.print();
		grid.put('X', 0, 1);
		grid.print();*/
		
		// 2) créer une méthode print qui permet d'afficher la grille
	
		/*
-------------
| O |   |   |
-------------
| X |   |   |
-------------
|   | X |   |
-------------
		 */
		
		
		}	
		

	}

}
