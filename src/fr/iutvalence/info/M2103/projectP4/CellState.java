package fr.iutvalence.info.M2103.projectP4;

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
	
}