package fr.iutvalence.info.M2103.projectP4;

/**
 * represents a player
 * @author augstm
 */
public class Player {
	
	/**
	 * number of this Player
	 */
	private final int numPlayer;
	
	private final CellState myColor;
	
	/**
	 * initialize a new player (with a given number)
	 * @param numPlayer
	 */
	public Player(int numPlayer){
		this.numPlayer=numPlayer;
		switch (numPlayer){
		case 1:
			this.myColor=CellState.YELLOW_TOKEN;
			break;
		case 2:
		default:
			this.myColor=CellState.RED_TOKEN;
			break;
		}
	}
	
	// TODO add methods
}
