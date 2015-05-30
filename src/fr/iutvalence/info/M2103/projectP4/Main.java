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
		InterfaceUser admin = new PlayerGUI(0);
		PlayerGUI p1 = new PlayerGUI(1);
		PlayerGUI p2 = new PlayerGUI(2);
		InterfaceGame myGame = new P4Game();
		Displaying disp = new Displaying(admin);
		SwingUtilities.invokeLater(disp);
		disp.addButtonWindow();
		myGame.play(p1, p2, disp);
	}
}