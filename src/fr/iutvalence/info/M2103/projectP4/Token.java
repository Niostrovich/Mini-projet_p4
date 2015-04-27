package fr.iutvalence.info.M2103.projectP4;
/**
 * Create token 
 * @author augstm
 *
 */

public class Token 
{
	/**
	 * token's color
	 */
	private static final boolean COLOR_RED = true; 
	private static final boolean COLOR_YELLOW = false;
	
	/**
	 *token's color 
	 */
	private boolean color;
	
	/**
	 * token's builder
	 */
	public Token(boolean color)
	{
	 this.color=color;
	}

}