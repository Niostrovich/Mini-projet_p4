package fr.iutvalence.info.M2103.projectP4;

/**
 * initialize new game
 * game procedures
 * @author AUGST Maxime and CHALUMEAU Joris
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
	 */
	public P4Game(){
		this.isWon=false;
		this.gameTable=new Grid();  // creates new grid (initializing game)
		this.player1=new Player(PLAYER_NUMBER_1);
		this.player2=new Player(PLAYER_NUMBER_2);
	}
	
	/**
	 * The game development : (follows the progress of the game)
	 * Most of the game procedures are called in this method
	 */
	public void play(){
		int numPlayer=1;
		boolean wasAdded;
		int numCol;
		boolean isADraw=false;
		
		this.player1.greetings();
		while (this.isWon==false){
			System.out.println(this.gameTable.gridToString());
			switch (numPlayer){
			case 1:
				numCol=this.player1.addNewToken();
				break;
			case 2:
			default:
				numCol=this.player2.addNewToken();
				break;
			}
			wasAdded=this.gameTable.addToken(numCol, numPlayer);
			this.wait1s();
			if (wasAdded){
				this.isWon=hasWon(numCol,numPlayer); // checking if this player won or not
				if (!this.isWon){
					isADraw=this.gameTable.gridFullOfToken();
					this.isWon=isADraw;
					numPlayer=numPlayerNextTurn(wasAdded, numPlayer);
	                		// with this, we can alternate turns between players 1 and 2
				}
			}
		}
		System.out.println("Final state of the Board Game:\n"+ this.gameTable.gridToString());
		switch (numPlayer){
		case 1:
			this.player1.cheers(isADraw);
			break;
		case 2:
		default:
			this.player2.cheers(isADraw);
			break;
		}
	}
	
	/**
	 * 1s delay before going on (better in order to follow the game step by step)
	 * it makes the game run more smoothly (or the computer will choose a column instantly)
	 */
	public void wait1s() {
		try {
			Thread.sleep(1000);    // 1s delay before going on (better in order to follow the game step by step)
		} catch (InterruptedException e) {
			// exception impossible (never happening)
		}
	}
	
	/**
	 * returns the number of the player in the next turn
	 * @param wasAdded (true if a token was added ; false otherwise)
	 * @param numPlayer (number of the current player)
	 * @return the number of the player in the next turn
	 */
	public int numPlayerNextTurn(boolean wasAdded, int numPlayer){
		if (wasAdded)
			numPlayer=(numPlayer%2)+1; // thanks to this, the player will be able to play again on the next turn
		return numPlayer;
	}
	
	/**
	 * returns true if the Player has won the game ; false otherwise
	 * @param columnAdded number of the column of the last added token
	 * @param numPlayer Player's number
	 * @return true if the Player has won the game ; false otherwise
	 */
	public boolean hasWon(int columnAdded, int numPlayer){
		/* this is the easiest way i could figure out
		(though there must be a way to stock the direction as a variable, to make it lighter)*/
		int numToken=1;
		int numLinColTest=1;
		int lineNum=(this.gameTable.columns[columnAdded].height)-1; // because the added token is at the top
		
		// horizontally
		while (columnAdded-numLinColTest>=0
				&& this.gameTable.samePlayerToken(columnAdded-numLinColTest, lineNum, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		numLinColTest=1;
		while (columnAdded+numLinColTest<Grid.NUMBER_OF_COLUMNS
				&& this.gameTable.samePlayerToken(columnAdded+numLinColTest, lineNum, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		
		// vertically
		numToken=1;
		numLinColTest=1;
		while (lineNum-numLinColTest>=0
				&& this.gameTable.samePlayerToken(columnAdded, lineNum-numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		numLinColTest=1;
		while (lineNum+numLinColTest<Grid.NUMBER_OF_LINES
				&& this.gameTable.samePlayerToken(columnAdded, lineNum+numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		
		// diagonnally (towards top right)
		numToken=1;
		numLinColTest=1;
		while (lineNum-numLinColTest>=0 && columnAdded-numLinColTest>=0
		        && this.gameTable.samePlayerToken(columnAdded-numLinColTest, lineNum-numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		numLinColTest=1;
		while (lineNum+numLinColTest<Grid.NUMBER_OF_LINES && columnAdded+numLinColTest<Grid.NUMBER_OF_COLUMNS
				&& this.gameTable.samePlayerToken(columnAdded+numLinColTest, lineNum+numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		
		
		// diagonally (towards top left)
		numToken=1;
		numLinColTest=1;
		while (lineNum-numLinColTest>=0 && columnAdded+numLinColTest<Grid.NUMBER_OF_COLUMNS
		        && this.gameTable.samePlayerToken(columnAdded+numLinColTest, lineNum-numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		numLinColTest=1;
		while (lineNum+numLinColTest<Grid.NUMBER_OF_LINES  && columnAdded-numLinColTest>=0 
				&& this.gameTable.samePlayerToken(columnAdded-numLinColTest, lineNum+numLinColTest, numPlayer)){
			numToken++;
			numLinColTest++;
		}
		if (numToken>=4)
			return true;
		
		// if the game isn't won
		return false;
	}
		
}