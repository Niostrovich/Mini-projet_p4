package fr.iutvalence.info.M2103.projectP4;

/**
 * Create grid
 * @author augstm
 *
 */
public class Grid {
	private final static int COLUMN_NUMBER = 6;
	/**
	 * Grid's builder
	 */
	public Grid()
	{
		for(int i=0;i<COLUMN_NUMBER; i++)
		{
			new Column();	
		}
		 	
	}
	

}
