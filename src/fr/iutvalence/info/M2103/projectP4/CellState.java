package fr.iutvalence.info.M2103.projectP4;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * represents a token 
 * @author AUGST Maxime and CHALUMEAU Joris
 */

public enum CellState {
	RED_TOKEN,
	YELLOW_TOKEN,
	NO_TOKEN;
	
	/**
	 * used for the Ascii-Art representation
	 * @return
	 */
	public String tokenToString()
	{
		if(this==RED_TOKEN)
		{
			return "  R  ";
		}
		if(this==YELLOW_TOKEN)
		{
			return "  Y  ";
		}
		return "     ";
	}

	/*public void voidToken(JFrame theWindow) {
		for (int numButton=0;numButton<42;numButton++)
			theWindow.add(new JButton().setIcon(new ImageIcon("./Desktop/Ordinateur/G/imgCaseP4-blanc.png")),theWindow);
	}*/
	
}