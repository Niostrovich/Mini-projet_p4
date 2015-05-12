package fr.iutvalence.info.M2103.projectP4;

import java.util.Random;

/**
 * initialize new game
 * game procedures
 * @author augstm
 *
 */
public class P4Game {
	/**
	 * integer corresponding to the number of the first player
	 */
	private final static int PLAYER_NUMBER_1=1;
	
	/**
	 * integer corresponding to the number of the second player
	 */
	private final static int PLAYER_NUMBER_2=2;
	
	/**
	 * Grid of the game : represents the game table during a game.
	 */
	public Grid gameTable;
	
	/**
	 * isWon=True if the game is over (one of the player has won or all the Columns are full of tokens).
	 * otherwise, isWon=false and the game continues
	 */
	protected boolean isWon;
	
	/**
	 * player number 1
	 */
	private Player player1;
	
	/**
	 * player number 2
	 */
	private Player player2;
	/**
	 * Starts a new game
	 * Most of the game procedures are called in this builder
	 */
	public P4Game() {
		this.isWon=false;
		this.gameTable=new Grid();  // creates new grid (initializing game)
		this.player1=new Player(PLAYER_NUMBER_1);
		this.player2=new Player(PLAYER_NUMBER_2);
	}
	
	public void play(){
		
		/*System.out.println("Welcome to this P4 game\n");
		System.out.println("We hope you enjoy this mini game ;)\n")*/
		
		int numPlayer;
		boolean wasAdded=true;
		
		for (numPlayer=1;this.isWon==false;numPlayer=numPlayerNextTurn(wasAdded, numPlayer)){ // with this, we can alternate turns between players 1 and 2
			/*System.out.println(this.gameTable.gridToString());
			System.out.println("Ou veux-tu rajouter le pion, joueur num "+ numPlayer + "\n");*/
			Random rand = new Random();
			int randNumb=rand.nextInt(7); // generates "randomly" between 0 and 7 (number of the chosen column) 
			wasAdded=this.gameTable.addToken(randNumb, numPlayer);
			this.wait1s();
		}
	}
	
	/**
	 * returns the number of the player in the next turn
	 * @param wasAdded (true if a token was added ; false otherwise)
	 * @param numPlayer (number of the current player)
	 * @return the number of the player in the next turn
	 */
	public int numPlayerNextTurn(boolean wasAdded, int numPlayer){
		if (wasAdded==true){
			numPlayer=(numPlayer%2)+1; // thanks to this, the player will be able to play again on the next turn
		}
		return numPlayer;
	}
	
	/**
	 * returns true if the current player has won; false otherwise
	 * @param numPlayer
	 */
	public boolean hasWon(int numPlayer){
		// TODO soon
		return false;
	}
	
	private void wait1s() {
		try {
			Thread.sleep(1000);    // 1s delay before going on (necessary in order to follow the game step by step)
		} catch (InterruptedException e) {
			// exception impossible
		}
	}
	
}