package fr.iutvalence.info.M2103.projectP4;

/**
 * represents the grid
 * it's our game's grid
 * 
 * @author augstm
 *
 */
public class Grid {

	/**
	 * number of columns
	 */
	private final static int NUMBER_OF_COLUMNS = 7;

	/**
	 * number of lines
	 */
	private final static int NUMBER_OF_LINES = 6;

	/**
	 * represents grid (=table of columns)
	 * the token always falls on the lowest possible place in the column
	 * 
	 */
	public Column[] columns=null;

	// TODO fix comment: detail comment, tell how is the grid once built (empty, full, ... ?) (DONE)
	/**
	 * Grid's builder column's grid
	 * Contains 6 (empty) columns
	 * In other words : builds a grid composed of 6 empty columns
	 */
	public Grid() {
		this.columns=new Column[NUMBER_OF_COLUMNS];
		for (int numCol = 0; numCol < NUMBER_OF_COLUMNS; numCol++) {
			this.columns[numCol] = new Column();
		}
	}
	
	// TODO write comment (DONE)
	/**
	 * the function add a token in the column if possible (empty slots available in the column).
	 * @param number number of the column (where the token is added).
	 * @param myColor color of the token that is added.
	 * @return true if token was added ; false otherwise.
	 */
	public boolean addToken(int colNumber, int numPlayer)
	{
		if (this.columns[colNumber].height<this.columns[colNumber].capacity){
			switch (numPlayer){
			case 1:
				this.columns[colNumber].cellStates[this.columns[colNumber].height-1]=CellState.YELLOW_TOKEN;
				break;
			case 2:
				this.columns[colNumber].cellStates[this.columns[colNumber].height-1]=CellState.RED_TOKEN;
				break;
			}
			this.columns[colNumber].height=this.columns[colNumber].height+1;
			return true;
		}
		return false;
	}
	
	
	/**
	 * Get an Ascii-Art representation of the grid
	 * 
	 */
	public String gridToString()
	{
		String p4AsciiArt = "-------------------------------------------\n";
		for (int lineNumber=NUMBER_OF_LINES-1; lineNumber>=0; lineNumber--)
		{
			for (int columnNumber=0; columnNumber< NUMBER_OF_COLUMNS; columnNumber++){
				p4AsciiArt+="|";
				p4AsciiArt += this.columns[columnNumber].tokenAtGivenHeightToString(lineNumber);
			}
			p4AsciiArt+="|";
			p4AsciiArt+="\n";
			p4AsciiArt+= "-------------------------------------------\n";
		}
		return p4AsciiArt;
	}
	
	
}
