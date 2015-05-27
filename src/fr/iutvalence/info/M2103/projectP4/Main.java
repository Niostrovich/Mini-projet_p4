package fr.iutvalence.info.M2103.projectP4;

import javax.swing.SwingUtilities;

/**
 * Main function run the program
 * 
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public class Main {
	/**
	 * the number of the first player
	 */
	private final static int PLAYER_NUMBER_1=1;
	
	/**
	 * the number of the second player
	 */
	private final static int PLAYER_NUMBER_2=2;
		
	/**
	 * method main (used to call the P4Game builder and its method play launching the game)
	 * @param args
	 */
	public static void main(String[] args) {
		PlayerGUI p1=new PlayerGUI(PLAYER_NUMBER_1);
		PlayerGUI p2=new PlayerGUI(PLAYER_NUMBER_2);
		Displaying disp = new Displaying(); 
		SwingUtilities.invokeLater(disp);
		p1.greetings(disp);
		
		P4Game myGame=new P4Game();
		myGame.play(p1, p2, disp);
		
		//  --> Without Graphic Interface version :
		//P4Game myGame=new P4Game();
		//myGame.play(p1, p2);
	}
}