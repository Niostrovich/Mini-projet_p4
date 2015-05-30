package fr.iutvalence.info.M2103.projectP4;

import java.awt.event.ActionEvent;

/**
 * User interface
 * => controls the methods of the class Player
 * @author AUGST Maxime and CHALUMEAU Joris
 *
 */
public interface PlayerGUI {
	
	/**
	 * get the column where a token will be added
	 * @param disp
	 * @return
	 */
	public int getColumn(Displaying disp);
	
	/**
	 * End message (victory, defeat or draw ?)
	 * @param draw
	 * @param disp
	 */
	public void cheers(boolean draw, Displaying disp);

	/**
	 * displays starting greetings and instructions (nothing more)
	 */
	public void greetings(Displaying disp);
	
	/**
	 * when clicked on a button
	 * @param e
	 */
	void actionPerformed(ActionEvent e);
	
	/**
	 * displays helping instructions
	 * (rules and commands)
	 * @param disp
	 */
	void helpInstructions(Displaying disp);	
	
}
