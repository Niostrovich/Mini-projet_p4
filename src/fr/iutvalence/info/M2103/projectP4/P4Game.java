package fr.iutvalence.info.M2103.projectP4;

// TODO fix comment (DONE)
/**
 * initialize new game
 * game procedures
 * @author augstm
 *
 */
public class P4Game {
	
	/**
	 * Grid of the game : represents the game table during a game.
	 */
	public Grid gameTable;
	
	/**
	 * aGagne=True if the game is over (one of the player has won or all the Columns are full of tokens).
	 * otherwise, aGagne=false and the game continues
	 */
	private boolean aGagne;
	
	/**
	 * Starts a new game
	 * Most of the game procedures are called in this builder
	 */
/*	public P4Game() {
		int numJoueur;
		this.aGagne=false;
		this.gameTable=new Grid();  //, creates new grid (initializing game)
		for (numJoueur=1;aGagne==false;numJoueur=((numJoueur+1)%2)+1){ // permet de garder les numéros de joueurs 1 et 2 selon le tour (grace au modulo)
			System.out.println(gameTable.toString());
			System.out.println("Ou rajouter le pion, joueur num "+ numJoueur);
			// appeler methode addToken ...
			// choix 'aleatoire' provisoirement :
			CellState myColor;
			
			switch (numJoueur){
			case 1:
				myColor=CellState.YELLOW_TOKEN;
				break;
			case 2:
				myColor=CellState.RED_TOKEN;
				break;
				
			}
			int randNumb=4; // a generer aleatoirement
			this.gameTable.addToken(randNumb, myColor);
		}
		System.out.println("le joueur num "+numJoueur+" a gagne");
	}
*/
}

