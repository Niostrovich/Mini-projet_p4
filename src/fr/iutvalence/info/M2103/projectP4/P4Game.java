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
	 * isWon=True if the game is over (one of the player has won or all the Columns are full of tokens).
	 * otherwise, isWon=false and the game continues
	 */
	private boolean isWon;
	
	/**
	 * Starts a new game
	 * Most of the game procedures are called in this builder
	 */
	public P4Game() {
		int numPlayer;
		boolean wasAdded=true;
		this.isWon=false;
		this.gameTable=new Grid();  // creates new grid (initializing game)
		for (numPlayer=1;isWon==false;numPlayer=(numPlayer%2)+1){ // with this, we can alternate turns between players 1 and 2
			System.out.println(gameTable.gridToString());
			System.out.println("Ou veux-tu rajouter le pion, joueur num "+ numPlayer + "\n");
			// choix 'aleatoire' provisoirement :
			int randNumb=4; // a generer aleatoirement
			wasAdded=this.gameTable.addToken(randNumb, numPlayer);
			if (wasAdded==false){
				System.out.println("You can't add a token there, the column is full\n");
				System.out.println("You can play again player "+ numPlayer + "\n");
				numPlayer=(numPlayer%2)+1; // thanks to this, the player will be able to play again on the next turn
			}
		}
		System.out.println("le joueur num "+numPlayer+" a gagne\n");
	}

}