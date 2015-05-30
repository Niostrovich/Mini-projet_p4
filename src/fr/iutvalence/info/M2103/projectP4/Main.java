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
	 * method main (used to call the P4Game builder and its method play launching the game)
	 * @param args
	 */
	public static void main(String[] args) {
		PlayerGUI admin = new Player(0);
		Player p1 = new Player(1);
		Player p2 = new Player(2);
		P4Game myGame = new P4Game();
		Displaying disp = new Displaying(admin);
		SwingUtilities.invokeLater(disp);
		disp.addButtonWindow();
		myGame.play(p1, p2, disp);
	}
}