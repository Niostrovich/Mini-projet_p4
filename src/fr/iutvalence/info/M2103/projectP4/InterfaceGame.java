package fr.iutvalence.info.M2103.projectP4;

/**
 * controls the interface of the game
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public interface InterfaceGame {
	
	/**
	 * game development
	 */
	public void play(PlayerGUI player1, PlayerGUI player2, Displaying disp);
	
	/**
	 * Main thread waiting 1s
	 */
	public void wait1s();
	
	/**
	 * returns the number of the player in the next turn
	 * @param wasAdded
	 * @param numPlayer
	 * @return
	 */
	public int numPlayerNextTurn(boolean wasAdded, int numPlayer);

}
