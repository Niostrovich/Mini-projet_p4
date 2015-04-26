package fr.iutvalence.info.M2103.projectP4;

// TODO fix comment: this class creates nothing, tell what it is
/**
 * Create grid
 * @author augstm
 *
 */
public class Grid {
	
	// TODO write comment
	private final static int COLUMN_NUMBER = 6;
	
	// TODO fix comment: detail comment, tell how is the grid once built
	/**
	 * Grid's builder
	 */
	public Grid()
	{
		for(int i=0;i<COLUMN_NUMBER; i++)
		{
			// TODO ask me to discuss about this
			new Column();	
		}
		 	
	}
	

}
